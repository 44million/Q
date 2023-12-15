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
  if ((current_hour >= 0 && current_hour < 12)); then
    echo "Good morning"
  elif ((current_hour >= 12 && current_hour < 18)); then
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
  cat <<EOL
Usage: $0 [OPTIONS]

Options:
  -s, --silent           Run in silent mode (suppress progress messages)
  -h, --help             Display this help menu
  -c, --customize        Customize the installation process
  -b, --build-local      Build the project locally
  -d, --download-release Download the latest release from GitHub
  -V, --verbose          Increase verbosity for debugging
  -u, --uninstall        Uninstall the application and remove installed files
  -f, --force            Force the script to run without asking for confirmation
  --debug                Enable debugging mode

Use Cases:
  - Customize Installation:
    $0 --customize

  - Build Locally:
    $0 --build-local

  - Download Latest Release:
    $0 --download-release

  - Uninstall Application:
    $0 --uninstall

  - Run in Silent Mode:
    $0 --silent

  - Force Execution without Confirmation:
    $0 --force

  - Enable Verbose Mode:
    $0 --verbose

  - Enable Debugging Mode:
    $0 --debug
EOL
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

# Function to handle downloading the latest release
function download_latest_release() {
  TMP_DIR=$(mktemp -d -t q_temp.XXXXXX)
  cd "$TMP_DIR" || exit 1

  # Download the latest release file
  echo
  echo "Downloading the latest release file..."
  if curl -# -L -o Q.jar "http://github.com/qRX53/Q/releases/latest/download/Q.jar"; then
    print_green "Download complete."
  else
    print_red "Error downloading the file. Exiting."
    exit 1
  fi

  # Create the 'q' script
  echo
  echo "Creating the 'q' script..."
  if echo "#! /usr/bin/env java -jar" > q && cat Q.jar >> q && chmod +x q; then
    print_green "'q' script created."
  else
    print_red "Error creating the 'q' script. Exiting."
    exit 1
  fi

  # Move the 'q' script to /usr/local/bin
  echo
  echo "Moving the 'q' script to /usr/local/bin..."
  if sudo mv q /usr/local/bin/; then
    print_green "'q' executable moved to /usr/local/bin."
  else
    print_red "Error moving the 'q' script. Exiting."
    exit 1
  fi

  # Update PATH
  echo
  echo "Updating PATH..."

  {
    export PATH="/usr/local/bin/q:$PATH"
    print_green "PATH updated."
  } || {
    print_red "Failed to update path."
  }

  # All steps completed
  echo
  print_green "Installation complete!"

  # Clean up: Remove the downloaded jar file
  echo
  echo "Cleaning up..."
  if rm Q.jar; then
    print_green "Post install clean up complete."
  else
    print_red "Error cleaning up. Please remove 'Q.jar' manually."
  fi

  # Print next steps
  echo
  print_green "To get started, run: q --version"
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
    -b|--build-local)
      build_local=true
      ;;
    -d|--download-release)
      download_release=true
      ;;
    -V|--verbose)
      verbose=true
      ;;
    -u|--uninstall)
      uninstall=true
      ;;
    -f|--force)
      force=true
      ;;
    --debug)
      debug=true
      ;;
    *)
      echo "Unknown option: $1"
      display_help
      exit 1
      ;;
  esac
  shift
done

# Check if both options are selected or none is selected
if [ "$build_local" == true ] && [ "$download_release" == true ]; then
  print_red "Error: Please choose either --build-local or --download-release, not both."
  display_help
  exit 1
elif [ "$build_local" != true ] && [ "$download_release" != true ]; then
  # If no flags are provided, prompt the user to choose between local build and download
  echo "Welcome to the Q installation script!"
  echo "Choose an option:"
  echo "1. Build locally"
  echo "2. Download the latest release"
  read -p "Enter the number corresponding to your choice: " user_choice

  case $user_choice in
    1)
      build_local=true
      ;;
    2)
      download_release=true
      ;;
    *)
      print_red "Invalid choice. Exiting."
      display_help
      exit 1
      ;;
  esac
fi

# Continue script based on user choice
# Try to gain root access if not already running with sufficient privileges
if [ "$EUID" -ne 0 ]; then
  print_green "Attempting to gain root access..."
  if sudo -v; then
    print_green "Root access granted."
  else
    print_red "Failed to gain root access. Please run the script as root or with sudo. Exiting..."
    exit 1
  fi
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

# Execute the chosen option
if [ "$download_release" == true ]; then
  download_latest_release
else
  customize_installation
fi

# Clean up hidden temporary directory
cd ~ || exit
rm -rf "$temp_dir"
