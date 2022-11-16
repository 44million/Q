#!/bin/bash

# define silly colors for figlet
GREEN='\033[0;32m'
NC='\033[0m'

# set color to green
echo -e "\n\n\n\n\n\n\n\n\n\n${GREEN}"

echo -e "Beginning install process. This will take a while, and will require sudo access. Please allow up to 5 minutes"

# leave green coloration.
echo -e "${NC}"

sleep 35 ;

# install brew, just in case user doesnt have it already
# shellcheck disable=SC2164
cd ; /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" ;
# install git, just in case user doesnt have it already
brew install git ;
# install mvn, just in case user doesnt have it already
brew install mvn ;
# install node, just in case user doesnt have it already
brew install node ;
# install npm, just in case user doesnt have it already
brew install npm ;
# install java, just in case user doesnt have it already
brew install java;
# install figlet, just in case user doesnt have it already
brew install figlet ;
# install wipeclean, just in case user doesnt have it already
npm install wipeclean -g ;
# clone the repo into a new folder
git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP;
# install cloc, just in case user doesnt have it already
brew install cloc ; 
# use the cloc command to verify that it's the correct repo, and then cd into the directory
cloc QLANGUPDATEFOLDERTEMP ; cd QLANGUPDATEFOLDERTEMP ;
# assemble the jarfile (with dependencies)
mvn clean compile assembly:single ;
# install trash, just in case user doesnt have it already
brew install trash ; 
# move the old Q jarfile into the trash.
sudo trash ~/.q/Q.jar ;
# change into the target folder, and then move the new jarfile into the home dir
cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ;
# cd to the home dir, make the .q folder if there isnt one already
cd ; ls ; sudo mkdir -p .q ;
# move the new jarfile into the .q folder, and rename it.
sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ;
# cd to the .q fodler
cd .q ;
# nonessential
ls ; cd ;
# move the cloned repo to the trash
trash QLANGUPDATEFOLDERTEMP ;
# neat little cls animation
wipeclean ;

# add the q cli command to the zshrc file
echo "alias q='java -jar ~/.q/Q.jar'" > ~/.zshrc

# same for bashrc file, in case user uses bash instead of zsh
echo "alias q='java -jar ~/.q/Q.jar'" > ~/.bashrc

# set color to green
echo -e "${GREEN}"

# create ansi 'success' text
figlet "Success!"

# leave green coloration.
echo -e "${NC}"

echo -e "Run 'q -v' to verify installation"
# simple as.