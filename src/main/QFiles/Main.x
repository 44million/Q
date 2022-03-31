namespace testing;

#import q.std;

class Obj

    noval var obj;

    cn Obj():
    end

    fn set(x):
        self::obj = x;
    end

    fn get():
        return self::obj;
    end

end

class Main : Obj

    fn main(args)

        new Obj as o();
        o::set("I LOVE LEAN");
        std::coutln(o::get());

        new Obj as o2();
        o2::set("test");
        std::cout(o2::get());

    end

end