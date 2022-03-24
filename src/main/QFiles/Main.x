namespace testing;

#import q.Random;
#import q.std;

class Main

    fn main()

        new Random as r();

        for (i in range(10))
            std::coutln(r::ran("str") + r::ran("str"));
        end

    end

end