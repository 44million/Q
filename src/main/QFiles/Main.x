#import [*];

class Obj

    var val;

    cn Obj():

    end

    fn set(v):
        self::val = v;
    end

    fn get():
        return self::val;
    end

end

class Main

    fn main(args):

        new Obj as obj1();

        obj1::set(1);
        std::coutln(obj1::get());

    end

end