#!/bin/bash

# define silly colors for figlet
ALIASQ='alias q'
clear

echo "Beginning install process. This will take a while, and will require sudo access. Please allow up to 5 minutes"

sleep 7

cd || exit

# install java, just in case user doesnt have it already
yay -S jre-openjdk-headless jre-openjdk jdk-openjdk openjdk-doc openjdk-src figlet maven git
# clone the repo into a new folder
git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP 2>/dev/null
cd QLANGUPDATEFOLDERTEMP || exit
# assemble the jarfile (with dependencies)
mvn clean compile assembly:single -q -B
# move the old Q jarfile into the trash.
sudo rm -r ~/.q/Q.jar
# change into the target folder, and then move the new jarfile into the home dir
cd target || exit
mv Q-1.0-jar-with-dependencies.jar ~/
# cd to the home dir, make the .q folder if there isnt one already
cd || exit
sudo mkdir -p .q
# move the new jarfile into the .q folder, and rename it.
sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar
# move the cloned repo to the trash
sudo rm -r QLANGUPDATEFOLDERTEMP
# clear the console
clear

if ! sudo grep -q "${ALIASQ}" "$~/.zshrc"; then
  # shellcheck disable=SC2024
  sudo echo "alias q='java -jar ~/.q/Q.jar'" >>~/.zshrc
fi

if ! sudo grep -q "${ALIASQ}" "$~/.bashrc"; then
  # shellcheck disable=SC2024
  sudo echo "alias q='java -jar ~/.q/Q.jar'" >>~/.bashrc
fi

if ! sudo grep -q "${ALIASQ}" "$~/.config/fish/config.fish"; then
  # shellcheck disable=SC2024
  sudo echo "function q" >>~/.config/fish/config.fish
  sudo echo "	java -jar ~/.q/Q.jar" >>~/.config/fish/config.fish
  sudo echo "end" >>~/.config/fish/config.fish
fi  

clear

# set color to green
echo "${GREEN}"

# create ansi 'success' text
figlet "Success!"

# leave green coloration.
echo "${NC}"

echo "Run 'q -v' to verify installation, or 'q -c <projectName>' to crete a new project!"
# simple as.

