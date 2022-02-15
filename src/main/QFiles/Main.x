#github "https://github.com/primevibetime/temp/blob/main/Import.l";
#github "https://github.com/primevibetime/temp/blob/main/Console.l";

#import src.main.QFiles.primary;

func main()

    println("This method was loaded in with github");

endf

class Main

    func main()

        WebServer web = new WebServer("9000");
        web.changeText("<body>Hello World</body>");

        Window win = new Window("Window", "900", "750");
        win.render();

        Window secondWin = new Window("Window number 2!", "200", "100");
        secondWin.render();

            try
                std:ln("Echo");
            catch (e)
                println(e);
            endf

    endf

endc