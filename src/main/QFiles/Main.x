@autoimport
class Vehicle
    fn honk()
        std::coutln("honk honk");
    end
end

@autoimport
class Sedan : Vehicle

    cn Sedan()

    end

    fn honk()
        std::coutln("honk honk");
    end

end

@autoimport
class MuscleCar : Vehicle

    noval var engine;
    noval var hp;

    cn MuscleCar()

    end

    fn revv()
        std::cout("VROOM VROOM");
    end

    fn setEngine(type)
        self::engine = type;
    end

    fn setHp(hp)

        if (self::engine == "viper V10")
            self::hp = 707;
        else
            self::hp = hp;
        end

    end

end

class Main

    fn main()

        new MuscleCar as challenger();
        challenger::hp = 90;

    end

end