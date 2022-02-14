#github "https://github.com/primevibetime/temp/blob/main/Import.l"


class Main
    func main()

        std:ln("Enter the port for your webserver now:");
        port = input();

        create WebServer(port);
        std:ln("Enter text for webserver now:");
        text = input();
        WebServer.changeText("<body><big>" + text + "</big></body>");

        std:ln("WebServer online! Visit it at localhost:" + port);

    endf
endc

run(150000);