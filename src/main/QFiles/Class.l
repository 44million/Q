class Runner

    noval c;
    noval j;

    const Runner()
        here.c = 20;
        here.j = 200;

    end

    func run(x)
        std:ln(c * j);
    end

end

class FileWriter

    func -> {
        std:ln("Class FileWriter initialized");
    }

    const FileWriter()

    end

    func w(path, content)

        new File as file(path);
        file.write(content);

    end

end

func main()
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
