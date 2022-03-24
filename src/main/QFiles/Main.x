namespace testing;

#import q.Random;
#import q.std;
#import [*];

class Main

    fn main()

        new Window as w("Hello, World!", 750, 750, 0, 0);
        w::create();

        w::setLayout("flow");
        std::coutln("after flow");
        w::setCloseOperation("HIDE_ON_CLOSE");
        std::coutln("after close");
        w::addComponent("button", "Click Me!");
        std::coutln("after button");
        w::setLocation(300, 300);
        std::coutln("after location");
        w::addComponent("checkbox", "Check me.");
        std::coutln("after checkbox");

        w::render();

    end

end