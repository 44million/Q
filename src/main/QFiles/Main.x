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

        w::add("button", "Click Me!");
        std::coutln("after button");

        w::setLocation(300, 300);
        std::coutln("after location");

        w::add("checkbox", "Check me.");
        std::coutln("after checkbox");

        w::setLocation(5000, 240);
        w::add("label", "Check me.");

        w::render();
        std::coutln("after render");

        std::coutln(w::getComponentCount());

    end

end