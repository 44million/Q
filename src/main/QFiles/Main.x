@autoimport


class Vehicle
    fn honk()
        std::coutln("honk honk");
    end
end

class MuscleCar

    var engine = "v4";
    var hp = 200;
    noval var model;

    cn MuscleCar()

    end

    fn revv()
        std::cout("VROOM VROOM");
    end

    fn setEngine(type)
        self::engine = type;
    end

    fn setModel(model)
        self::model = model;
    end

    fn setHp(hp)
        self::hp = hp;
    end

    fn getModel()
        return self::model;
    end

    fn getHp()
        return self::hp;
    end

end

class Main

    fn main()

        new MuscleCar as challenger();
        challenger::setHp(707);
        challenger::setEngine("viper V10");
        challenger::setModel("SRT Demon");

        std::cout(challenger::hp);

    end

end