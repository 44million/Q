#import <q.Console>;
#import <q.Random>;

class NumberGuessingGame {

    cn NumberGuessingGame():
        std::coutln("Welcome to the Number Guessing Game!");
    end

    async fn playGame():
        var secretNumber = 6;
        var attempts = 0;

        std::coutln("I've selected a random number between 1 and 100. Can 
you guess it?");

        while (true):
            var guess = std::cin();
            attempts = attempts + 1;

            if (guess < secretNumber):
                std::coutln("Too low! Try again.");
            else if (guess > secretNumber):
                std::coutln("Too high! Try again.");
            else:
                std::coutln("Congratulations! You guessed the number " + 
secretNumber);
                std::coutln("It took you " + attempts + " attempts.");
                break;
            end
        end
    end
}

// Create an instance of NumberGuessingGame and play the game
var game = NumberGuessingGame();
game.playGame();

