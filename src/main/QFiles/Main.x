#import q.Windows;
#import q.Files;
#import q.Math;


// :)

class Main

    func main()

        Window win = new Window("Window", "200", "100");
        win.render();

            try
                std:ln("this is an outputstream test. 'std' stands for standard, and 'ln' stands for printline, infrencing the standard outputstream in Q.");
            catch (e)
                println(e);
                sys.quit(0);
            endf

        sys.flush();

        File file = new File("src/main/QFiles/primary.l");
        file.write("awooooga");

        std:ln(pow(6, 9));
        // mass where volume is 6, and density(15, 22) is d
        std:ln(mass(6, density(15, 22)));

    endf

endc