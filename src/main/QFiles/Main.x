// built in imports
#import q.Windows;
#import q.Files;
#import q.Math;
#import q.Audio;
#import q.http;
#import q.Random;
#import q.Console;
#import q.Time;
#import q.puddle;

// file system imports
#import src.main.QFiles.primary;
#import src.main.QFiles.Class;

// github file import
#import "https://github.com/primevibetime/temp/blob/main/Console.l";

class Main

    func m23()
        std:ln("Hello there");
    endf

endc

    func f(x)
        return x * 2;
    endf

    func m()

        f(8);

        for (i in range(10)) do
            std:ln(i);
        endf

        for (i = 0 to 10) do
            std:ln(i);
        endf

        noval thisisavariable;

        thisisavariable = 0;

        std:ln(thisisavariable);

        Window win = new Window("Window", "400", "400");
        win.render();

        // time package testing
        std:ln(time.cur());
        std:ln(time.date());

        // files package testing
        std:ln(files.here());
        std:ln(files.exists("src/main/QFiles/primary.l"));
        std:ln(files.canRead("src/main/QFiles/primary.l"));
        std:ln(files.size("src/main/QFiles/primary.l"));

        std:ln("Enter a string now:");
        port = std:in();

        // puddle.start("127.0.0.1", 8000);

        // std:ln(fib(9));

        if (1 > 2) do
            sys.quit(0);
        endf

        if (2 > 1) do
            std:ln("2 is greater than 1");
        endf

            try
                std:ln("this is an outputstream test.");
            onflaw
                sys.quit(0);
            endf

        File file = new File("src/main/QFiles/primary.l");
        file.write("// comment written here aja");

        std:ln(pow(6, 9) + " <--- value of 6^9");
        // mass where volume is 6, and density(15, 22) is d
        std:ln(mass(6, density(15, 22)) + " <--- mass, where density is 'd = 15/22''");

        // these will print the same function out, as one is a raw std:ln statement, and the other is a function with an std:ln statement inside of that
        std:ln(ranInt() + " <-- random integer!");
        pRandom();

        std:ln("The instant at which Q was launched was: ");
        std:ln(IAL());

        std:ln("The epoch at launch was: ");
        std:ln(EAL());

        func -> {
            std:ln("Anonymous function babyyyy");
        }

        WebServer web = new WebServer("9000");
        web.changeText("Hello World");

        std:ln(o(9));

        Runner r = new Runner();
        r.run();

    endf