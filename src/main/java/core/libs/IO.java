package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

import static java.lang.String.format;

public class IO extends QLibrary {

    private final String qcode =
            """
                                
                    class InputStream
                                
                        const InputStream()
                            
                        endf
                        
                        func input()
                            
                            x = std:in();
                            return x;
                            
                        endf
                                
                    endc
                                
                    class OutputStream
                                
                        const OutputStream()
                        
                        endf
                        
                        func printline(x)
                            std:ln(x);
                        endf
                        
                        func out(x)
                            std:out(x);
                        endf
                                
                    endc
                                
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
