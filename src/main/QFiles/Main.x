#import [*];
#import src.main.QFiles.TestLibrary;

class Object

    noval value;

    cn Object();

    fn set(x)
        self.value = x;
    end

    fn get()
        return self.value;
    end

end

class Writer : Object

    noval val;

    cn Writer();

    fn set(x)
        self.val = x;
    end

    fn get()
        return self.val;
    end

end

class Main

    fn main()

        new Writer as w();
        // if you dont call 'set', the 'val' variable will be null.
        w.set("Hello there");

        std:ln(w.get());

        new Random as r();
        ran = r.ran("int");

        std:ln(ran);

    end

end

