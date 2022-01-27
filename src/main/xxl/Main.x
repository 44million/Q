class Main
    void main()
        std:ln("Test");

        port = "8000";
        create WebServer(port);
        WebServer.changeText(port);
        std:ln("WebServer online! Visit it at localhost:" + port);


        std:ln("Enter text for the WebServer: ");
        x = input();

        WebServer.changeText(x);

        std:ln("Text changed to: " + x);

    endf
endc