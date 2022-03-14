/*
    This import is simply to demonstrate how the `@autoimport` tag works, by importing the `all` file
    and parsing the contents, you parse the `@autoimport` tag, meaning that every library is imported.
*/
#import all;

class Obj

    noval var value;

    cn Obj()

    end

    fn set(v)
        self::value = v;
    end

    fn get()
        return self::value;
    end

end

class BaseClass

end

class Main : BaseClass

    fn main()

        new Obj as o();
        o::set("he");
        std::cout(o::value);

    end

end
