#!/bin/bash

function print_green() { echo -e "$(tput setaf 2)$1$(tput sgr0)"; }
function print_red() { echo -e "$(tput setaf 1)$1$(tput sgr0)"; }

function get_greeting() {
  current_hour=$(date +%H) greeting="Good evening"
  ((current_hour >= 5 && current_hour < 17)) && greeting="Hello"
  echo "$greeting"
}

function calculate_percentage() {
  total_steps=8 completed_steps=$1
  percentage=$((completed_steps * 100 / total_steps))
  echo "$percentage% done"
}

function display_help() {
  echo "Usage: $0 [-s|--silent] [-h|--help] [-c|--customize]"
  echo "Options:"
  echo "  -s, --silent     Run in silent mode (suppress progress messages)"
  echo "  -h, --help       Display this help menu"
  echo "  -c, --customize  Customize the installation process"
}

function customize_installation() {
  echo "Customizing installation..."

  read -rp "Enter Maven command (default: 'mvn clean compile assembly:single'): " maven_command
  maven_command=${maven_command:-mvn clean compile assembly:single}

  read -rp "Enter installation directory (default: '/usr/local/bin/'): " install_dir
  install_dir=${install_dir:-/usr/local/bin/}

  read -rp "Do you want to update the PATH? (yes/no, default: yes): " update_path
  update_path=${update_path:-yes}

  read -rp "Run in a temporary folder? (yes/no, default: yes): " temp_folder
  temp_folder=${temp_folder:-yes}

  temp_dir="/tmp/.q_setup_custom"
  mkdir -p "$temp_dir" && cd "$temp_dir" || { print_red "Error changing to temporary directory"; exit 1; }

  echo "Cloning the repository..."
  git clone http://github.com/QRX53/Q || { print_red "Error cloning repository"; exit 1; }
  print_green "$(calculate_percentage 1) - Repository cloned successfully!"

  cd Q || { print_red "Error changing to Q directory"; exit 1; }

  echo "Building the project..."
  $maven_command || { print_red "Error building the project"; exit 1; }
  print_green "$(calculate_percentage 2) - Project built successfully!"

  echo "Renaming the JAR file..."
  mv target/Q-1.0-jar-with-dependencies.jar target/Q.jar || { print_red "Error renaming the JAR file"; exit 1; }
  print_green "$(calculate_percentage 3) - JAR file renamed successfully!"

  echo "Creating and setting up the script..."
  { echo "#! /usr/bin/env java -jar"; cat target/Q.jar; } > q
  chmod +x q || { print_red "Error setting up the script"; exit 1; }
  print_green "$(calculate_percentage 4) - Script created and set up successfully!"

  echo "Moving the JAR file to $install_dir..." && mv target/Q.jar "$install_dir" || { print_red "Error moving the JAR file"; exit 1; }
  print_green "$(calculate_percentage 5) - JAR file moved successfully!"

  if [ "$update_path" ]; then
    echo "Updating the PATH..." && export PATH="$install_dir:$PATH" || { print_red "Error updating the PATH"; exit 1; }
    print_green "$(calculate_percentage 6) - PATH updated successfully!"
  else
    print_green "$(calculate_percentage 6) - PATH not updated"
  fi

  print_green "$(calculate_percentage 7) - Customized script executed successfully!"

  [ "$temp_folder" ] && cd ~ || exit && rm -rf "$temp_dir"
}

while [[ "$#" -gt 0 ]]; do
  case $1 in
    -s|--silent) silent_mode=true ;;
    -h|--help) display_help; exit 0 ;;
    -c|--customize) customize_installation; exit 0 ;;
    *) echo "Unknown option: $1"; display_help; exit 1 ;;
  esac
  shift
done

greeting=$(get_greeting)
echo "$greeting! Starting the script..."

[ "$EUID" -ne 0 ] && { print_red "This script must be run as root or with sudo. Exiting..."; exit 1; }

temp_dir="/tmp/.q_setup"
mkdir -p "$temp_dir" && [ -d "$temp_dir/Q" ] && { print_green "Existing 'Q' folder found. Deleting..."; rm -rf "$temp_dir/Q"; }

cd "$temp_dir" || { print_red "Error changing to temporary directory"; exit 1; }
[ "$silent_mode" ] && exec > /dev/null 2>&1

echo "Cloning the repository..."
[ "$silent_mode" ] && git clone -q http://github.com/QRX53/Q || git clone http://github.com/QRX53/Q
print_green "$(calculate_percentage 1) - Repository cloned successfully!"

cd Q || { print_red "Error changing to Q directory"; exit 1; }
[ "$silent_mode" ] && { mvn -q clean compile assembly:single || exit 1; } || mvn clean compile assembly:single
print_green "$(calculate_percentage 2) - Project built successfully!"

echo "Renaming the JAR file..."
mv target/Q-1.0-jar-with-dependencies.jar target/Q.jar || { print_red "Error renaming the JAR file"; exit 1; }
print_green "$(calculate_percentage 3) - JAR file renamed successfully!"

echo "Creating and setting up the script..."
{ echo "#! /usr/bin/env java -jar"; cat target/Q.jar; } > q
chmod +x q || { print_red "Error setting up the script"; exit 1; }
print_green "$(calculate_percentage 4) - Script created and set up successfully!"

echo "Moving the JAR file to /usr/local/bin/..." && mv target/Q.jar /usr/local/bin/ || { print_red "Error moving the JAR file"; exit 1; }
print_green "$(calculate_percentage 5) - JAR file moved successfully!"

echo "Updating the PATH..." && export PATH="/usr/local/bin/q:$PATH" || { print_red "Error updating the PATH"; exit 1; }
print_green "$(calculate_percentage 6) - PATH updated successfully!"

print_green "$(calculate_percentage 7) - Script executed successfully!"

cd ~ || exit && rm -rf "$temp_dir"
