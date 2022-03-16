#import q.std;
#import src.main.QFiles.Object;

class Main

    fn main()
        new Object as o();
        o::set("This is an Object, this :str value is held in the VALUE variable");
        std::cout(o::get());
    end

end