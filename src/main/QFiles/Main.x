@header File

#import [all];

class File

    // should be 'console', but its 'Console', because 'console' is a reserved keyword
    new OutputStream as Console();

    func main()
        Console.printline("Hello World!");

        if (true)
            std:ln("Or you can say 'Hello World' like this!");
        else if (false)
            std:ln("This will never execute");
        else
            std:ln("This also will not execute, as the first statement in the 'if' sequence was true.");
        end

    end

end