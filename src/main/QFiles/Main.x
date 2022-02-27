#import [*];

class Writer

    noval val;

    cn Writer();

    fn set(x)
        here.val = x;
    end

    fn get()
        return here.val;
    end

end

class Main

    fn main()

        new Writer as w();
        w.set("Hello there");

        std:ln(w.get());

    end

end