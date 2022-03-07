// these do the same thing
#import [all];
#import [*];

class Object

    cn Object();

    noval value;

    async fn get()
        return self::value;
    end

    async fn set(ne)
        self::value = ne;
    end

end

#import [*];

class Main

    fn main()

        new Object as o();
        o::set("val");
        std::ln(o::get());

        std::ln("itj");

    end

end