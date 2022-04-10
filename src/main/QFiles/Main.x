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

        var one = args[0];
        var two = args[1];

        std::cout(one + " " + two);

        // var o = new Obj();


    end

end