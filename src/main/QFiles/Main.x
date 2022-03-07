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

class Main

    fn e(x)
        std::ln(x);
    end

    fn e()
        std::ln("Function overloading");
    end

    fn main()

        try
            std::ln("orih");
        onerr
            std::ln("heoi");
        end

        new Object as o();
        o::set("val");
        std::ln(o::get());

        std::ln("itj");

        e("this");
        e();

    end

end