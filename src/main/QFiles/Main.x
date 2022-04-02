namespace testing;

#import q.std;
#import q.io;

class Sub

    cn Sub():

    end

    fn g():
        return 200;
    end

end

class Objext

    var obj;
    new Sub as sub();

    cn Obj():
    end

    fn set(x):
        self::obj = x;
    end

    fn get():
        return self::obj;
    end

    fn ss():
        return self::sub;
    end

end

class Main : Objext

    fn main(args)

        fn getObj():
            new Objext as obj();
            obj::set(100);
            return obj;
        end

        /*
        new Objext as obj();

        obj::set("200");

        std::cout(obj::ss()::get());
        */

        std::cout(getObj()::get());

    end

end