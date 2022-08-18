#import q.std;
#import q.http;
#import q.Console;

class FileTreeCreator

    fn run():

        var fileTree = std::compilerFileTree();

        std::coutln("Enter a file location, or enter 'skip' to skip, and default to 'src/main/QFiles/CompilerFileTree.exyl'");
        var loc = std::cin();

        if (loc == "skip"):
            loc = "src/main.QFiles/CompilerFileTree.exyl";
        else:
            std::cout(" ");
        end

        Files::writeFile(loc, fileTree);

    end

end

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
                std::coutln("quit - Quit the program (equivalent to sys::quit(0))");
                std::coutln("help - Show this help menu");
                std::coutln();
            else if (x == "restart"):
                sys::restart();
            else:
                std::coutln("unknown command: ''" + x + "' [Check that your spelling is correct, and that the command exists ('help')");
                std::coutln();
            end
        end
    end

end

class Main

    fn main(args):

        var addy = 8080;
        var filename = "src/main/QFiles/index.html";

        new WebServer as w(addy);
        w::fromFile(filename);
        w::update();

        std::coutln("Localhost is now online running '" + filename + "' on port '" + addy + "'");
        std::coutln("CLI active, enter 'help' for assistance.");

        new CLI as cli();
        cli::init();
        cli::read();

    end

end