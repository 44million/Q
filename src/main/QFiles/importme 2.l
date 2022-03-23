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

