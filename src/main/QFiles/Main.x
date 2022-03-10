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

        const var full = path + fname;

        std::workspace("make", path);
        std::workspace("makefile", full);
        std::ln(io::getClass());

        if (std::workspace("verify", full))
            std::coutln(full + " was created successfully!");
        else
            std::coutln(full + " was not created.");
        end

    end

end