#github "https://github.com/primevibetime/temp/blob/main/Import.l";
#github "https://github.com/primevibetime/temp/blob/main/Console.l";

#import q.Windows;
#import q.Files;

func main()

    println("This method was loaded in with github");

endf

class Main

    func main()

        Window win = new Window("Window", "200", "100");
        win.render();

            try
                std:ln("this is an outputstream test. 'std' stands for standard, and 'ln' stands for printline, infrencing the standard outputstream in Q.");
            catch (e)
                println(e);
            endf

        File file = new File("src/main/QFiles/primary.l");
        file.append("Hello there General Kenobi");

    endf

endc