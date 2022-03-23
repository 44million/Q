#import q.io;
#import q.std;

class Secondary

    cn Secondary()
    end

    fn trycatch()
        try
            new Window as w("no", 70, 70);
        except
            <"suppress">
            io::err("Could not call the window package");
        end
    end

end

// this works!
@autoimport
class Main

    fn main()
        std::coutln("Help me");

        new Secondary as s();
        s::trycatch();

        new File as file("src/main/QFiles/archive.l");


    end

end