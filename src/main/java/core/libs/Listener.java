package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class Listener extends QLibrary {

    @SuppressWarnings("all")
    public final String qcode =
            """
                                
                    class Listener
                                
                        cn Listener();
                                
                        fn unusable()
                        
                            return std:in();
                        
                        end
                        
                        fn cout(x)
                            std:out(x); 
                            std:ln();
                        end
                                
                    end
                                
                    """;

    @Override
    public String getName() {
        return "q.Listener";
    }

    @Override
    public void init() {
        Parser parser = new Parser().fromText(this.qcode);
        try {
            parser.parse(false);
        } catch (IOException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }
}
