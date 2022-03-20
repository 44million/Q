@header ObjectLibrary

@autoimport
class Object

    cn Object()

    end

    noval var VALUE;

    fn set(nv)
        self::VALUE = nv;
    end

    fn get()
        return self::VALUE;
    end

end
