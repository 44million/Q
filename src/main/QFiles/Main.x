@header Main

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

class Main : Writer

    fn main()

        new Writer as w();
        w.set("Hello there");

        std:ln(w.get());

        new Random as r();

        ran = r.ran("bool");
        std:ln(ran);

    end

end