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

class Main : Obj

    fn main()
        new Obj as o();
        o::set("he");
        std::cout(o::value);
    end

end
