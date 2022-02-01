func init()

    std:ln("Welcome to the XXL build tool!");
    std:ln("Enter the name for your project now: ");

    name = input();

    std:ln("Name successfully set to: " + name);
    std:ln("Generating files...");

    s = "class " + name;
    s1 = "\tvoid main()";
    s2 = "\t\t std:ln();";
    s3 = "\tendf";
    s4 = "endc";

    final = s + s1 + s2 + s3 + s4;

    path = "src/main/xxl/ClassTesting.l";

    File f = new File(path);

    verify(f);

    f.append(final);

endf