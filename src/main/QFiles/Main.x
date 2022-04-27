#import q.std;
#import q.Files;

class Obj

    var value;

    cn Obj():

    end

    fn set(va):
        self::value = va;
    end

    fn get():
        return self::value;
    end

end

class Main : Obj


    fn main(args):

        var fileTree = std::compilerFileTree();

        Files::writeFile("test.txt", fileTree);

    end

end