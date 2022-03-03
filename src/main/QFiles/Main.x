#import [*];
#import [all];

class Object

    cn Object();

    noval value;

    fn get()
        return self.value;
    end

    fn set(ne)
        self.value = ne;
    end

end

class Main

    fn main()

        new Object as object1();
        object1.set("this is obj1");

        new Object as object2();
        object2.set("this is obj2");

        std:ln(object1.get());
        std:ln(object2.get());

    end

end