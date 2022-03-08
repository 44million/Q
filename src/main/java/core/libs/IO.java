package core.libs;

import core.etc.Environment;
import core.etc.Parser;
import core.lang.INativeFunction;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class IO extends QLibrary {

    private final String qcode =
            """
                                
                    class InputStream
                                
                        cn InputStream()
                        
                        end
                        
                        fn input()
                            
                            var x = std::in();
                            return x;
                            
                        end
                                
                    end
                                
                    class OutputStream
                                
                        cn OutputStream()
                        
                        end
                        
                        fn printline(x)
                            std::ln(x);
                        end
                        
                        fn out(x)
                            std::out(x);
                        end
                        
                        fn newline()
                            std::ln();
                        end
                                
                    end
                                
                    """;

    @Override
    public String getName() {
        return "q.io";
    }

    @Override
    public void init() {

        Parser parser = new Parser().fromText(this.qcode);
        try {
            parser.parse(false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
