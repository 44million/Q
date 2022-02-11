class Main
    void main()

        std:ln("Enter the port for your webserver now:");
        port = input();

        create new WebServer as web(port);
        std:ln("Enter text for webserver now:");
        text = input();
        // WebServer.changeText("<body><big>" + text + "</big></body>");

        std:ln("WebServer online! Visit it at localhost:" + port);

    endf
endc

/*
create new Window as win("Hello", "600", "450");
win.render();
*/