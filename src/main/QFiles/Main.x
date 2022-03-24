namespace std;

@autoimport
class CLI

    noval var isOn;

    cn CLI()

    end

    fn on()
        self::isOn = true;
    end

    fn off()
        self::isOn = false;
    end

    fn listen()

        std::coutln("Enter text:");
        var input = std::cin();

        if (input == "print hello")
            std::cout("hello");
        else if (input == "print goodbye")
            std::cout("goodbye");
        else
            std::cout("I don't understand what you said");
            sys::quit(-1);
        end

    end

end

@autoimport
class Main

    fn main()

        new CLI as cli();

        cli::on();

        cli::listen();

        cli::off();

    end

end