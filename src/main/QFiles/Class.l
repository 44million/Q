class Runner

    noval c;
    noval j;

    const Runner()
        c = 20;
        j = 200;

        std:ln(c);
        std:ln(j);

    endf

    func run(x)
        std:ln(x * 2);
    endf

endc

class FileWriter

    func -> {
        std:ln("Class FileWriter initialized");
    }

    const FileWriter()

    endf

    func w(path, content)

        File file = new File(path);
        file.write(content);

    endf

endc

func main()
    Runner runner = new Runner();
    runner.run(2);
    // should be 4.0

    // buggy code, not sure whats going on here tbh
    // not buggy anymore!

    // outputstream test, it works!
    OutputStream out = new OutputStream();
    out.out("OutputStream test, enter something: ");

    // inputstream test
    InputStream i = new InputStream();
    x = i.input();
    out.printline("Looks like you said, '" + x + "'");

        if (x == "no") do
            out.out("Saying no to me is not nice");
            out.printline("");
        else if (x == "yes") do
            out.out("Thank you for saying yes");
            out.printline("");
        else do
            out.out("Tbh i have no idea what '" + x + "' means");
            out.printline("");
        endf

    // FileWriter class
    FileWriter fw = new FileWriter();
    fw.w("src/main/QFiles/primary.l", "// " + x);

    alist = [
        ['a', 'b', 'c'],
        ['d', 'e', 'f'],
        ['g', 'h', 'i']
    ];

    std:ln(alist[0][2] + " <-- alist indexes [0][2]");

    Calculator calc = new Calculator();
    xyz = calc.mul(20, 73);
    out.printline(xyz);

endf
