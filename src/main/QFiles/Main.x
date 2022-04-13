#import q.std;
#import q.Math;

class Main

    fn main(args):

        var x = "9";
        std::coutln(x * 20);
        // 99999999999999999999

        var y = Math::toInt(x);
        std::coutln(y * 20);
        // 180

        std::cout(std::fns());

    end

end