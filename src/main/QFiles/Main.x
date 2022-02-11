void main()

    std:ln("Enter the port for your webserver now:");
    port = input();
    std:ln("It made it");

    create new WebServer as web(port);
    std:ln("it made it to the second one");

    std:ln("Enter text for webserver now:");
    text = input();
    std:ln("it made it to the third one");
    web.changeText("<body><big>" + text + "</big></body>");

    std:ln("WebServer online! Visit it at localhost:" + port);

endf