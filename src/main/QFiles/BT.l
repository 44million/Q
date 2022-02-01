func init()

    std:ln("Welcome to the XXL build tool!");
    std:ln("Enter the name for your project now: ");

    name = input();

    std:ln("Name successfully set to: " + name);
    std:ln("Generating files...");

    path = "src/main/QParserAndLexer/ClassTesting.l";

    File f = new File(path);

    f.append("final");

endf