#import q.std;

class Object

    var x;

    cn Object():
    end

    fn set(x):
        self::x = x;
    end

    fn get():
        return self::x;
    end

end

class Main : Object

    fn main(args):

        new Object as obj1();
            obj1::set(90);
            std::coutln("obj1's value: " + obj1::get());
        new Object as obj2();
            obj2::set(91);
            // wont work because when creating new class, 
            // because the new class java file still references the same list of vars and such.
            std::coutln("obj1's value: " + obj1::get());
            std::coutln("obj2's value: " + obj2::get());
    end

end