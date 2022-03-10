#import q.io;
#import q.Files;
#import src.main.QFiles.File;
#import q.FileUtils;
#import q.Random;

class Main

    fn main()

        new Random as r();
        var salt = r::ran("str");
        var path = "src/main/QFiles/" + salt + "/";
        var fname = salt + ".l";

        std::cout("test");

        var ls = "vro";

        std::coutln(ls);

        const var final = path + fname;

        std::workspace("make", path);
        std::workspace("makefile", final);

        if (std::workspace("verify", final))
            std::coutln(final + " was created successfully!");
        else
            std::coutln(final + " was not created.");
        end

    end

end