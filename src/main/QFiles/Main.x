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
        std::coutln(y * 20);
        // 180

        try:
            var z = Math::toInt("2");
            var zSquared = z * z;
            var zCubed = zSquared * z;
            std::coutln(zSquared);
        except:
            <"printafter">
            std::coutln("error");
        // error
        end

    end

end