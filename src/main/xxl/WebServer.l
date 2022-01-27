func CreateServer(s)
    // use built in web server functionality
    create WebServer(8000);
    WebServer.changeText(s);
endf
