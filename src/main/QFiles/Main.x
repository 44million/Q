#import src.main.QFiles.List;

#import [*];

class Main

    async fn run()
        std:ln("Hello World");
    end

    fn main()

        noval x;
        const y = 7;

        x = 7;

        std:ln(y * x);

        for (i in range(1000))
            run();
        end

        new List as l();
        l.init();
        l.add("Hello World!");
        std:ln(l.get(0));

    end

end

