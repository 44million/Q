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


