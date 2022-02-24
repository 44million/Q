package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

import static java.lang.String.format;

public class IO extends QLibrary {

    private final String qcode =
            format("""
            
            class InputStream
            
                const InputStream()
                    
                endf
                
                func cin()
                    
                    x = std:in();
                    return x;
                    
                endf
                
                func chashi()
                    return "%s";
                endf
            
            endc
            
            class OutputStream
            
                const OutputStream()
                
                endf
                
                func pln(x)
                    std:ln(x);
                endf
                
                func out(x)
                    std:out(x);
                endf
                
                func chasho()
                    return "%s";
                endf
            
            endc
            
            """, System.console().hashCode(), System.console().hashCode());

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
