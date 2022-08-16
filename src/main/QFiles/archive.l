class Obj

    cn Obj()

    end

    fn get()
        return "Hello World";
    end

end

// the autoimport tag will automatically import all .q libraries as they are called
@autoimport
class Main

    fn main()

        io::err("This will be red or something");

        std::coutln("Enter something:");

        var input = std::cin();

        std::cout(input);

        io::err("This will be red or something");


        try
            std::iuhfiehfru("this will fail");
        on (flaw)
            io::err("Error message");
        end

    end

end

class Runner

    noval c;
    noval j;

    cn Runner();

    fn run(x)
        std:ln(c * j);
    end

end

class FileWriter

    fn ->
        std:ln("Class FileWriter initialized");
    end

    FileWriter();

    fn w(path, content)

        new File as file(path);
        file.write(content);

    end

end

fn main()
    new Runner as runner();
    runner.run(2);
    // should be 4.0

    // buggy code, not sure whats going on here tbh
    // not buggy anymore!

    // outputstream test, it works!
    new OutputStream as out();
    out.out("OutputStream test, enter something: ");

    // inputstream test
    new InputStream as i();
    x = i.input();
    out.printline("Looks like you said, '" + x + "'");

        if (x == "no")
            out.out("Saying no to me is not nice");
            out.printline("");
        else if (x == "yes")
            out.out("Thank you for saying yes");
            out.printline("");
        else
            out.out("Tbh i have no idea what '" + x + "' means");
            out.printline("");
        end

    // FileWriter class
    new FileWriter as fw();
    fw.w("src/main/QFiles/primary.l", "// " + x);

    alist = [
        ['a', 'b', 'c'],
        ['d', 'e', 'f'],
        ['g', 'h', 'i']
    ];

    std:ln(alist[0][2] + " <-- alist indexes [0][2]");

    new Calculator as calc();
    xyz = calc.mul(20, 73);
    out.printline(xyz);

end

@header HelloWorld
#import [all];

class HelloWorld:

    fn main():

        new OutputStream as out();

        if (1 < 2)
            out.printline("Hello World!");
        end

    end

end

@header Main

#import [all];

class Main

    fn ->
        std:ln("This is an anonymous function!");
    end

    // note that for now, the async keyword does nothing
    async fn itsFunction(x, w, e, r, t)
        return x * w * e * r * t;
    end

    fn main()
        // keep in mind, 'console' is a reserved keyword
        new OutputStream as cc();
        cc.out("Hello World!");
        cc.newline();

        if (true)
            std:ln("Or you can say 'Hello World' like this!");
        else if (false)
            std:ln("This will never execute");
        else
            std:ln("This also will not execute, as the first statement in the 'if' sequence was true");
        end

        for (i in range(5))
            std:ln(itsFunction(ranInt(), 2, ranInt(), 6, 99));
        end

    end

end

class Obj

    cn Obj()

    end

    fn get()
        return "Hello World";
    end

end

// the autoimport tag will automatically import all .q libraries as they are called
@autoimport
class Main

    fn main()

        io::err("This will be red or something");

        std::cout("Enter something:");

        var input = std::cin();

        std::cout(input);

        io::err("This will be red or something");

        try
            std::iuhfiehfru("this will fail");
        on (flaw)
            io::err("Error message");
        end

        var here = Files::here();
        const var loc = here + "/file.l";

        std::workspace("makefile", loc);

    end

end

// benchmark tests woo
@autoimport
class Vehicle
    fn honk()
        std::coutln("honk honk");
    end
end

@autoimport
class Sedan : Vehicle

    cn Sedan()

    end

    fn honk()
        std::coutln("hello");
    end

end

@autoimport
class MuscleCar : Vehicle

    cn MuscleCar()

    end

    fn revv()
        std::cout("world");
    end

end

class Main

    fn main()

        new Sedan as charger();
        charger::honk();

        new MuscleCar as challenger();
        challenger::revv();

    end

end

@autoimport
class Vehicle
    fn honk()
        std::coutln("honk honk");
    end
end

@autoimport
class Sedan : Vehicle

    cn Sedan()

    end

    fn honk()
        std::coutln("honk honk");
    end

end

@header DefaultFileLibrary

class DefaultFile

    noval var content;
    noval var path;

    cn DefaultFile()

    end

    fn setPath(x)
        self::path = x;
    end

    fn setContent(x)
        self::content = x;
    end

    fn scribe()
        new File as f(self::path);
        f::write(self::content);
    end

    fn get(x)
        if (x == "path")
            return self::path;
        else if (x == "content")
            return self::content;
        else
            return "invalid";
        end
    end

end

#import q.std;

@autoimport
class CLI

    noval var isOn;

    cn CLI()

    end

    fn on()
        self::isOn = true;
    end

    fn off()
        self::isOn = false;
    end

    fn listen()

        std::coutln("Enter text:");
        var input = std::cin();

        if (input == "print hello")
            std::cout("hello");
        else if (input == "print goodbye")
            std::cout("goodbye");
        else
            std::cout("I don't understand what you said");
        end

    end

end

@autoimport
class Main

    fn main()

        new CLI as cli();

        cli::on();

        cli::listen();

        cli::off();

    end

end

namespace testing;

class Main

    fn main()

        /*
            PLEASE NOTE: using lang::parse creates a separate environment,
            meaning that any variables, objects, or classes created:
            WILL NOT BE ACCESSIBLE ANYWHERE BUT INSIDE THE ENCLOSED CODE BLOCK.
        */

        const var content = """
                #import test;

                class Main

                    fn runTheRunner()
                        new Runner as runner();

                        runner::start();
                        runner::run();
                        runner::stop();

                    end

                    runTheRunner();

                end

            """;


        try
            var path = "test.l";

            lang::parse("parseFile", path);
            lang::parse("parseString", content);
        except
            <"printafter">
            std::err("error: ");
        end
    end

end

namespace testing;

#import [*];

class TestCase

    noval var name;

    cn TestCase():

    end

    fn set(v):9
        self::name = v;
    end

    fn get():
        return self::name;
    end
end

class Main

    fn main():

        new TestCase as t();

        t::set("test");

        new TestCase as t2();

        t2::set("test2");

        std::coutln(t::get());
        std::coutln(t2::get());

    end

end

#import [*];

class Runner

    noval var isRunning;

    cn Runner()
        std::cout("Runner");
    end

    fn start()
        std::cout("running");
        self::isRunning = true;
    end

    fn run()
        if (self::isRunning)
            std::cout("running");
        else
            std::cout("not running");
        end
    end

    fn stop()
        std::cout("stopped");
        self::isRunning = false;
    end

end

namespace testing;

#import q.Time;
#import q.std;
#import q.awt;

class TestCase

    noval var name;

    cn TestCase():

    end

    fn set(v):
        self::name = v;
    end

    fn get():
        return self::name;
    end
end

class Main

    fn main():

        new TestCase as t();

        t::set("test");

        new TestCase as t2();

        t2::set("test2");

        std::coutln(t::get());
        std::coutln(t2::get());

        std::coutln(std::property("user.dir"));
        std::coutln(std::libraries(false));
        std::coutln(std::parsed());

        // cur, date, instant
        std::coutln(Time::cur());


    end

end

fn run(x):
    std::cout(x);
end

#import q.std;

class Main

    fn main(cliArgs):

        var hello = cliArgs[0];
        var there = cliArgs[1];
        var kenobi = hello + " " + there;
        std::cout(kenobi);

    end

end

namespace testing;

#import q.std;

class Obj

    noval var obj;

    cn Obj():
    end

    fn set(x):
        self::obj = x;
    end

    fn get():
        return self::obj;
    end

end

class Main : Obj

    fn main(args)

        new Obj as o();
        o::set("I LOVE LEAN");
        std::cout(o::get());

    end

end

namespace testing;

#import q.std;
#import q.io;

class Obj

    noval var obj;

    cn Obj():
    end

    fn set(x):
        self::obj = x;
    end

    fn get():
        return self::obj;
    end

end

class Main : Obj

    fn main(args):

        var one = args[0];
        var two = args[1];

        std::cout(one + " " + two);

        // var o = new Obj();


    end

end

#import q.std;
#import q.Math;
#import q.http;

class Main

    fn main(args):

        var x = "9";
        std::coutln(x * 20);
        // 99999999999999999999

        var y = Math::toInt(x);
        std::coutln(y * 20);
        // 180

        std::cout(std::fns());

        new WebServer as w(8080);
        w::fromFile("src/main/QFiles/index.html");

        return 0;

    end

end

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
            else if (x == "restart"):
                sys::restart("RESTARTCODE");
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

#import q.std;

class Obj

    var value;

    cn Obj():

    end

    fn set(va):
        self::value = va;
    end

    fn get():
        return self::value;
    end

end

class Main : Obj


    fn main(args):

        new Obj as o();
        o::set(10);

        new Obj as o2();
        o2::set(20);

        std::coutln("o's value = " + o::get());
        std::coutln("o2's value = " + o2::get());

    end

end

#import q.std;
#import q.Files;

class Main


    fn main(args):

        var fileTree = std::compilerFileTree();

        Files::writeFile("src/main/QFiles/CompilerFileTree.exyl", fileTree);

    end

end

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

        new FileTreeCreator as ftc();
        ftc::run();

        new WebServer as w(addy);
        w::fromFile(filename);
        w::update();

        std::coutln("Localhost is now online running '" + filename + "' on port '" + addy + "'");

        new CLI as cli();
        cli::init();
        cli::read();

    end

end