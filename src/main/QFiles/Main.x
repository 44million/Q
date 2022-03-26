namespace testing;

class Main

    fn main()

        const var content = "#import q.awt; #import q.std; var x = 'Hello There'; std::coutln(x);";

        lang::parse("parseString", content);

    end

end