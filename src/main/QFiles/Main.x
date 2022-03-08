#import q.io;
#import q.Environment;

class Main

    fn main()

        io::println("sout test");
        io::printf("this is a %s", "test");

        io::err("This is an error message!");
        io::errf("this is an %s", "error within a printf statement");

        io::println("Enter something: ");
        var input = io::input();

        io::printf("Input was: %s.", input);

        io::println(Environment::property("user.home"));

    end

end