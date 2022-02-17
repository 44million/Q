// built in imports
#import q.Windows;
#import q.Files;
#import q.Math;
#import q.Audio;
#import q.http;
#import q.Random;
#import q.Time;

// file system imports
#import src.main.QFiles.primary;

// github file import
#github "https://github.com/primevibetime/temp/blob/main/Console.l";

class Main

    func main()

        Component c = new Component("text", "Hello World!");
        Window win = new Window("Window", "400", "400");
        win.render();

        std:ln("Enter a port now:");
        port = std:in();

            try
                std:ln("this is an outputstream test.");
            catch (e)
                println(e);
                sys.quit(0);
            endf

        File file = new File("src/main/QFiles/primary.l");
        file.write("// comment written here");

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

        // sys function that doesnt exist, to test error stuff

            /*
                try
                    sys.nonexistant();
                catch (e)
                    std:ln("Error message here");
                endf
            */

        WebServer web = new WebServer(port);
        web.changeText("Hello World");

        std:ln(o(9));

    endf

    count = 0;
    func recursive(n)

        n = n - 1;
        count = count + 1;
        std:out(n);
        std:out(" <-- count number: " + count);

        if (n == -100) do
            return n;
        endf

        return recursive(n);

    endf

endc