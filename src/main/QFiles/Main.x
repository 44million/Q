#import [*];
#import src.main.QFiles.TestLibrary;

class Writer

    noval val;

    cn Writer();

    fn set(x)
        self.val = x;
    end

    fn get()
        return self.val;
    end

end

class Main : Writer

    fn main()

        new Writer as w();
        w.set("Hello there");

        std:ln(w.get());

        new Random as r();
        ran = r.ran("int");

        std:ln(ran);

    end

end