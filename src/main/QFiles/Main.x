#import q.io;
#import q.Files;
#import src.main.QFiles.File;
#import q.FileUtils;
#import q.Random;

class Main

    fn main()

        new Random as r();
        var path = "src/main/QFiles/testDir" + r::ran("str") + "/";
        var fname = r::ran("str") + ".l";

        std::cout("test");

        var ls = "vro";

        std::coutln(ls);

        const var final = path + fname;

        std::workspace("make", path);
        std::workspace("makefile", final);

    end

end