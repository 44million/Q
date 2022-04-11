#import q.std;
#import q.Math;

class Main

    fn main(args):
    /*
        std::coutln(std::fns());
        var x = std::cin("src/main/QFiles/archive.l");
        var spl = std::split(x, "\n");
        std::println(spl);
    */

        var x = "9";
        std::coutln(x * 20);
        // 99999999999999999999

        var y = Math::toInt(x);
        std::cout(y * 20);
        // 180
    end

end