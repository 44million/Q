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
        std::coutln("hello");
    end

end

@autoimport
class MuscleCar : Vehicle

    cn MuscleCar()

    end

    fn revv()
        std::cout("world");
    end

end

class Main

    fn main()

        new Sedan as charger();
        charger::honk();

        new MuscleCar as challenger();
        challenger::revv();

    end

end