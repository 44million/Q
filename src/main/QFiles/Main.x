#import q.Time;

class E

    noval var x;

    cn E()
    end

    fn print()
        std::ln(self::x);
    end

end

class Main

    fn main()

        new E as e();

        e::print();

        std::ln(Time::retvalue());

    end

end