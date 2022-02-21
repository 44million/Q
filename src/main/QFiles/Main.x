// built in imports
#import q.Windows;
#import q.Files;
#import q.Math;
#import q.Audio;
#import q.http;
#import q.Random;
#import q.Console;
#import q.Time;

// file system imports
#import src.main.QFiles.primary;

// github file import
#import "https://github.com/primevibetime/temp/blob/main/Console.l";

class Main

    func run()
        std:ln("run method in: main");
    endf

    func main()

        for i in range(10) do
            std:ln(i);
        endf

        for i = 0 to 10 do
            std:ln(i);
        endf


        Window win = new Window("Window", "400", "400");
        win.render();

        // time package testing
        std:ln(time.cur());
        std:ln(time.date());

        // files package testing
        std:ln(files.here());

        std:ln("Enter a string now:");
        port = std:in();

            try
                std:ln("this is an outputstream test.");
            onflaw
                println(e);
                sys.quit(0);
            endf

        File file = new File("src/main/QFiles/primary.l");
        file.write("// file");

        WebServer web = new WebServer("9000");
        web.changeText("Hello World");

    endf

endc

Main.run();