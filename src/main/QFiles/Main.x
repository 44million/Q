#import q.std;
#import q.Math;
#import q.http;

class Main

    fn main(args):

        var x = "9";
        std::coutln(x * 20);
        // 99999999999999999999

        var y = Math::toInt(x);
        std::coutln(y * 20);
        // 180

        std::cout(std::fns());

        new WebServer as w(8080);
        w::fromFile("src/main/QFiles/index.html");

        return 0;

    end

end