#import q.std;

class Obj

    var value;

    cn Obj():

    end

    fn set(va):
        self::value = va;
    end

    fn get():
        return self::value;
    end

end

class Main : Obj


    fn main(args):

        new Obj as o();
        o::set(10);

        new Obj as o2();
        o2::set(20);

        std::coutln("o's value = " + o::get());
        std::coutln("o2's value = " + o2::get());

    end

end