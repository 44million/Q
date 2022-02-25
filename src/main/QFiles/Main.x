@header File

#import [all];

class File

    new OutputStream as out();

    func main()
        out.printline("Hello World!");

        if (true)
            std:ln("Or you can say 'Hello World' like this!");
        else if (false)
            std:ln("This will never execute");
        else
            std:ln("This also will not execute, as the first statement in the 'if' sequence was true.");
        end

    end

end