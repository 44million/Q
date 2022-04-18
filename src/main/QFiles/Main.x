#import q.std;
#import q.http;
#import q.Console;

class CLI

    cn CLI():

    end

    fn init():

    end

    fn read():
        new InputStream as xyz;

        for (i in range(300)):
            // better to use InputStream rather than std::cin because it is buffered
            var x = xyz::input();

            if (x == "quit"):
                sys::quit(0);
            else if (x == "help"):
                std::coutln("quit - quit the program");
                std::coutln("help - show this help");
                std::coutln();
            else if (x == "http"):
                http::get("http://www.google.com");
            else if (x == "console"):

            else:
                std::coutln("unknown command: " + x);
                std::coutln();

            end
        end
    end

end

class Main

    fn main(args):

        new WebServer as w(8080);
        w::fromFile("src/main/QFiles/index.html");
        w::update();

        new CLI as cli();
        cli::init();
        cli::read();

    end

end