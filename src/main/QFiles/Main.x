@header Main

#import [all];

class Main

    fn ->
        std:ln("This is an anonymous function!");
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

        f();

    end

    async fn f()

        std:ln("Async functions baby!");

    end

end


