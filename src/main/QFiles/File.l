@header DefaultFileLibrary

class DefaultFile

    noval var content;
    noval var path;

    cn DefaultFile()

    end

    fn setPath(x)
        self::path = x;
    end

    fn setContent(x)
        self::content = x;
    end

    fn scribe()
        new File as f(self::path);
        f::write(self::content);
    end

end