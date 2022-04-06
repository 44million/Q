namespace testing;

#import q.std;
#import q.io;

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

    fn main(args):

        std::err(std::getClass());

        std::coutln(std::fns());

    end

end