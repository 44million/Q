#github "https://github.com/primevibetime/temp/blob/main/Import.l"

class Main
    void main()

        std:ln("Enter the port for your webserver now:");
        port = input();

        create WebServer(port);
        std:ln("Enter text for webserver now:");
        text = input();
        WebServer.changeText("<body><big>" + text + "</big></body>");

        std:ln("WebServer online! Visit it at localhost:" + port);

    endf
endc

if (1 < 2) do
    std:ln("If Statement Test");
endf

Window win = new Window("Hello", "600", "450");
win.render();