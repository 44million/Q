#!/bin/bash

# shellcheck disable=SC2164
cd ; /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" ;
brew install git ;
brew install mvn ;
brew install node ;
brew install npm ;
brew install figlet ;
npm install wipeclean -g ;
git clone http://github.com/qRX53/Q/ QLANGUPDATEFOLDERTEMP;
brew install cloc ; cloc QLANGUPDATEFOLDERTEMP ; cd QLANGUPDATEFOLDERTEMP ;
mvn clean compile assembly:single ;
brew install trash ; sudo trash ~/.q/Q.jar ;
cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ;
cd ; ls ; sudo mkdir -p .q ;
sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ;
cd .q ;
ls ; cd ;
trash QLANGUPDATEFOLDERTEMP ;
wipeclean ;

echo "alias q='java -jar ~/.q/Q.jar'" > ~/.zshrc

echo "alias q='java -jar ~/.q/Q.jar'" > ~/.bashrc

GREEN='\033[0;32m'
NC='\033[0m'

echo -e "${GREEN}"

figlet "Success!"

echo -e "${NC}"