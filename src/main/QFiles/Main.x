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
        o::set("this is o");
        std::coutln(o::get());

        new Obj as o2();
        o2::set("this is o2");
        std::coutln(o2::get());

        std::coutln(o::get());

    end

end