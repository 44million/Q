// note, only THREE functions can be called without importing the std library, std::ln, std::out, std::in
#import q.std;

class Obj

    cn Obj()

    end

    fn get()
        return "Hello World";
    end

end

class Main

    fn main()
        new Obj as o();
        std::cout(o::get());
    end

end