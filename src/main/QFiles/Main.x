#import q.std;
#import q.Files;

class Main


    fn main(args):

        var fileTree = std::compilerFileTree();

        Files::writeFile("src/main/QFiles/CompilerFileTree.exyl", fileTree);

    end

end