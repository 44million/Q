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

    // FileWriter class
    FileWriter fw = new FileWriter();
    fw.w("src/main/QFiles/primary.l", "// here i hope");

    /*

    buggy code, not sure whats going on here tbh

    OutputStream out = new OutputStream();
    out.print("OutputStream test");

    InputStream in = new InputStream();
    x = in.cin();
    out.println(x);
    */

endf
