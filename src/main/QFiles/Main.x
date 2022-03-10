#import q.Random;
#import q.io;

class Main

    fn main()

        new Random as r();
        var salt = r::ran("str");

        var path = "src/main/QFiles/" + salt + "/";
        var fname = salt + ".l";

        new Window as w("Hello There", 400, 750)
        w::render();

        const var full = path + fname;

        /*
            std::workspace("make", path);
            std::workspace("makefile", full);
            std::ln(io::getClass());

            if (std::workspace("verify", full))
                std::coutln(full + " was created successfully!");
            else
                std::coutln(full + " was not created.");
            end
        */

    end

end