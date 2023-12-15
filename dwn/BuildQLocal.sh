#!/bin/bash

# Function to print in green
function print_green() {
  echo -e "$(tput setaf 2)$1$(tput sgr0)"
}

# Function to print in red
function print_red() {
  echo -e "$(tput setaf 1)$1$(tput sgr0)"
}

# Function to get the greeting based on the current time
function get_greeting() {
  current_hour=$(date +%H)
  if ((current_hour >= 20 || current_hour < 5)); then
    echo "Good evening"
  elif ((current_hour >= 5 && current_hour < 17)); then
    echo "Good afternoon"
  else
    echo "Good evening"
  fi
}

# Function to calculate percentage completion
function calculate_percentage() {
  total_steps=8
  completed_steps=$1
  percentage=$((completed_steps * 100 / total_steps))
  echo "$percentage% done"
}

# Function to display help menu
function display_help() {
  echo "Usage: $0 [-s|--silent] [-h|--help] [-c|--customize]"
  echo "Options:"
  echo "  -s, --silent     Run in silent mode (suppress progress messages)"
  echo "  -h, --help       Display this help menu"
  echo "  -c, --customize  Customize the installation process"
}

# Function to handle customization
function customize_installation() {
  echo "Customizing installation..."

  # Prompt user for Maven command
  read -p "Enter Maven command (default: 'mvn clean compile assembly:single'): " maven_command
  maven_command=${maven_command:-"mvn clean compile assembly:single"}

  # Prompt user for installation directory
  read -p "Enter installation directory (default: '/usr/local/bin/'): " install_dir
  install_dir=${install_dir:-"/usr/local/bin/"}

  # Prompt user for PATH update
  read -p "Do you want to update the PATH? (yes/no, default: yes): " update_path
  update_path=${update_path:-"yes"}

  # Prompt user for running in a temporary folder
  read -p "Run in a temporary folder? (yes/no, default: yes): " temp_folder
  temp_folder=${temp_folder:-"yes"}

  # Move to the chosen directory
  if [ "$temp_folder" == "yes" ]; then
    temp_dir="/tmp/.q_setup_custom"
    mkdir -p "$temp_dir"
    cd "$temp_dir" || { print_red "Error changing to temporary directory"; exit 1; }
  else
    cd "$install_dir" || { print_red "Error changing to installation directory"; exit 1; }
  fi

  # Clone the repository
  echo "Cloning the repository..."
  git clone http://github.com/QRX53/Q || { print_red "Error cloning repository"; exit 1; }
  print_green "$(calculate_percentage 1) - Repository cloned successfully!"

  cd Q || { print_red "Error changing to Q directory"; exit 1; }

  # Build the project
  echo "Building the project..."
  $maven_command || { print_red "Error building the project"; exit 1; }
  print_green "$(calculate_percentage 2) - Project built successfully!"

  # Rename the JAR file
  echo "Renaming the JAR file..."
  mv target/Q-1.0-jar-with-dependencies.jar target/Q.jar || { print_red "Error renaming the JAR file"; exit 1; }
  print_green "$(calculate_percentage 3) - JAR file renamed successfully!"

  # Create and set up the script
  echo "Creating and setting up the script..."
  echo "#! /usr/bin/env java -jar" > q
  cat target/Q.jar >> q
  chmod +x q || { print_red "Error setting up the script"; exit 1; }
  print_green "$(calculate_percentage 4) - Script created and set up successfully!"

  # Move the JAR file to the chosen directory
  echo "Moving the JAR file to $install_dir..."
  mv target/Q.jar "$install_dir" || { print_red "Error moving the JAR file"; exit 1; }
  print_green "$(calculate_percentage 5) - JAR file moved successfully!"

  # Update the PATH
  if [ "$update_path" == "yes" ]; then
    echo "Updating the PATH..."
    export PATH="$install_dir:$PATH" || { print_red "Error updating the PATH"; exit 1; }
    print_green "$(calculate_percentage 6) - PATH updated successfully!"
  else
    print_green "$(calculate_percentage 6) - PATH not updated"
  fi

  # All steps completed successfully
  print_green "$(calculate_percentage 7) - Customized script executed successfully!"

  # Clean up temporary directory if used
  if [ "$temp_folder" == "yes" ]; then
    cd ~ || exit
    rm -rf "$temp_dir"
  fi
}

# Check for command-line options
while [[ "$#" -gt 0 ]]; do
  case $1 in
    -s|--silent)
      silent_mode=true
      ;;
    -h|--help)
      display_help
      exit 0
      ;;
    -c|--customize)
      customize_installation
      exit 0
      ;;
    *)
      echo "Unknown option: $1"
      display_help
      exit 1
      ;;
  esac
  shift
done

# Greet the user based on the current time
greeting=$(get_greeting)
echo "$greeting! Starting the script..."

# Check for root/sudo privileges
if [ "$EUID" -ne 0 ]; then
  print_red "This script must be run as root or with sudo. Exiting..."
  exit 1
fi

# Move to a hidden temporary directory
temp_dir="/tmp/.q_setup"
mkdir -p "$temp_dir"

# Check if 'Q' folder already exists in /tmp/
if [ -d "$temp_dir/Q" ]; then
  print_green "Existing 'Q' folder found. Deleting..."
  rm -rf "$temp_dir/Q"
fi

cd "$temp_dir" || { print_red "Error changing to temporary directory"; exit 1; }

# Check for silent mode
if [ "$silent_mode" == true ]; then
  exec > /dev/null 2>&1
fi

# Step 1: Clone the repository
if [ "$silent_mode" == true ]; then
  git clone -q http://github.com/QRX53/Q || { print_red "Error cloning repository"; exit 1; }
else
  echo "Cloning the repository..."
  git clone http://github.com/QRX53/Q || { print_red "Error cloning repository"; exit 1; }
fi
print_green "$(calculate_percentage 1) - Repository cloned successfully!"

# Step 2: Build the project
cd Q || { print_red "Error changing to Q directory"; exit 1; }
if [ "$silent_mode" == true ]; then
  mvn -q clean compile assembly:single || { print_red "Error building the project"; exit 1; }
else
  echo "Building the project..."
  mvn clean compile assembly:single || { print_red "Error building the project"; exit 1; }
fi
print_green "$(calculate_percentage 2) - Project built successfully!"

# Step 3: Rename the JAR file
echo "Renaming the JAR file..."
mv target/Q-1.0-jar-with-dependencies.jar target/Q.jar || { print_red "Error renaming the JAR file"; exit 1; }
print_green "$(calculate_percentage 3) - JAR file renamed successfully!"

# Step 4: Create and set up the script
echo "Creating and setting up the script..."
echo "#! /usr/bin/env java -jar" > q
cat target/Q.jar >> q
chmod +x q || { print_red "Error setting up the script"; exit 1; }
print_green "$(calculate_percentage 4) - Script created and set up successfully!"

# Step 5: Move the JAR file to /usr/local/bin/
echo "Moving the JAR file to /usr/local/bin/..."
mv target/Q.jar /usr/local/bin/ || { print_red "Error moving the JAR file"; exit 1; }
print_green "$(calculate_percentage 5) - JAR file moved successfully!"

# Step 6: Update the PATH
echo "Updating the PATH..."
export PATH="/usr/local/bin/q:$PATH" || { print_red "Error updating the PATH"; exit 1; }
print_green "$(calculate_percentage 6) - PATH updated successfully!"

# All steps completed successfully
print_green "$(calculate_percentage 7) - Script executed successfully!"

# Clean up hidden temporary directory
cd ~ || exit
rm -rf "$temp_dir"
