#import q.io;
#import q.std;
#import q.FileUtils;

class Secondary

    cn Secondary()
    end

    fn trycatch()
        try
            new Window as w("no", 70, 70);
        except
            <"printafter">
            io::err("Could not call the window package");
        end
    end

end

// this works!
@autoimport
class Main

    fn (x, y) ->

        std::cout("This is an anonymous functionnnnnnn so");

    end

    fn main()
        std::coutln("Help me");

        new Secondary as s();
        s::trycatch();
        new Random as r();
        var path = "src/main/QFiles/" + r::ran("str") + ".l";

        std::cout(std::workspace("makefile", path));

    end

end