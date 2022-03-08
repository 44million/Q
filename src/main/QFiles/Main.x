#import q.io;
#import q.Files;
#import src.main.QFiles.File;

class Main

    fn main()

        io::cout("test\n");

        new DefaultFile as df();
        df::setPath("src/main/QFiles/importme.l");

        std::ln("Enter a username: ");
        var user = std::in();
        std::ln("Enter a password: ");
        var pass = std::in();

        var upluscomma = user + ",";
        var total = upluscomma + pass;

        std::ln(total);

        df::setContent(total);
        df::scribe();

    end

end