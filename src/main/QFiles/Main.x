#import q.std;
#import q.io;

class Obj

    cn Obj()

    end

    fn get()
        return "Hello World";
    end

end

class Main

    fn main()

        io::err("This will be red or something");

        std::coutln("Enter something:");

        var input = std::cin();

        std::cout(input);

        io::err("This will be red or something");


        try
            std::iuhfiehfru("this will fail");
        on (flaw)
            io::err("Error message");
        end

    end

end