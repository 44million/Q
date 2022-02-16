#import q.Windows;
#import q.Files;

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
        file.write("awooooga");

    endf

endc