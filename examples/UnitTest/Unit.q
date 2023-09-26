#import <q.Console>;
#import <q.Time>;
#import <q.Math>;

class MyProgram {

    cn MyProgram():
        std::coutln("Hello from Q!");
    end

    async fn main():
        std::coutln("This is the main function.");

        var num1 = 10;
        var num2 = 20;

        std::coutln("Sum of num1 and num2: " + (num1 + num2));

        if (num1 > num2):
            std::coutln("num1 is greater than num2");
        else if (num2 > num1):
            std::coutln("num2 is greater than num1");
        else:
            std::coutln("num1 and num2 are equal");
        end

        var myArray = [1, 2, 3, 4, 5];
        std::coutln("First element of the array: " + myArray[0]);
        
        var userInput = std::cin();
        std::coutln("You entered: " + userInput);

        var currentTime = Time::cur();
        std::coutln("Current time: " + currentTime);

        var squareRoot = Math::sqrt(25);
        std::coutln("Square root of 25: " + squareRoot);
    end
}

// Create an instance of MyProgram and run the main function
var program = MyProgram();
program.main();
