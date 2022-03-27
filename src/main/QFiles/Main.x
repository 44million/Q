namespace testing;

#import [*];

class TestCase

    noval var name;

    cn TestCase()

    end

    fn set(v)
        self::name = v;
    end;

    fn get()
        return self::name;
    end;
end

class Main

    fn main()

        new TestCase as t();

        t::set("test");

        new TestCase as t2();

        t2::set("test2");

        std::coutln(t::get());
        std::coutln(t2::get());

    end

end