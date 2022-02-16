// built in imports
#import q.Windows;
#import q.Files;
#import q.Math;
#import q.mp3;
#import q.http;
#import q.Random;

// file system imports
#import src.main.QFiles.primary;

// github file import
#github "https://github.com/primevibetime/temp/blob/main/Console.l";

class Main

    func main()

        Window win = new Window("Window", "200", "100");
        win.render();

        std:ln("Enter a port now:");
        port = std:in();

        WebServer web = new WebServer(port);


            try
                std:ln("this is an outputstream test.");
            catch (e)
                println(e);
                sys.quit(0);
            endf

        File file = new File("src/main/QFiles/primary.l");
        file.write("// comment written here");

        std:ln(pow(6, 9));
        // mass where volume is 6, and density(15, 22) is d
        std:ln(mass(6, density(15, 22)));

        // these will print the same function out, as one is a raw std:ln statement, and the other is a function with an std:ln statement inside of that
        std:ln(ranInt() + " <-- random integer!");
        pRandom();
    endf

endc