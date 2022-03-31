namespace testing;

#import q.Time;
#import q.std;

class TestCase

    noval var name;

    cn TestCase():

    end

    fn set(v):
        self::name = v;
    end

    fn get():
        return self::name;
    end
end

class Main

    fn main():

        new TestCase as t();

        t::set("test");

        new TestCase as t2();

        t2::set("test2");

        std::coutln(t::get());
        std::coutln(t2::get());

        std::coutln(std::property("user.dir"));
        std::coutln(std::libraries(false));
        std::coutln(std::parsed());

        // cur, date, instant
        std::coutln(Time::cur());


    end

end