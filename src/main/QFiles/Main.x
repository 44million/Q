#import [*];
#import [all];
#import q.gtp;

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

class Main

    fn main()

        fn() ->
            std::ln("anonymous functioooooooon baby");
        end

        new Object as object1();
        object1::set("this is obj1");

        new Object as object2();
        object2::set("this is obj2");

        std::ln(object1::get());
        std::ln(object2::get());

        std::ln(GTP::text(40));

    end

end