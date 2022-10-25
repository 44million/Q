#import q.std;
#import q.http;
#import UnitTest;

class Main
    fn main(args):

        new UnitTest as ut();
        ut::runfunctiontests(2, 4, 5);
        ut::runsystemtests("Hello, World", 15, 25);

    end
end