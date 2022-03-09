#import q.io;
#import q.Files;
#import src.main.QFiles.File;
#import q.FileUtils;
#import q.Random;

class Main

    fn main()

        new Random as r();

        std::cout("test");

        var ls = "vro";

        std::coutln(ls);
        var path = "src/main/QFiles/testDir" + r::ran("str") + "/";
        var fname = r::ran("str") + ".l";

        std::workspace("make", path);
        std::workspace("makefile", path + fname);

    end

end