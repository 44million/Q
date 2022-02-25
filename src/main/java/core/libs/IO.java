package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class IO extends QLibrary {

    private final String qcode =
            """
                                
                    class InputStream
                                
                        const InputStream()
                            
                        end
                        
                        func input()
                            
                            x = std:in();
                            return x;
                            
                        end
                                
                    end
                                
                    class OutputStream
                                
                        const OutputStream()
                        
                        end
                        
                        func printline(x)
                            std:ln(x);
                        end
                        
                        func out(x)
                            std:out(x);
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
