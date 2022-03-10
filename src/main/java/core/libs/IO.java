package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class IO extends QLibrary {

    @Override
    public String getName() {
        return "q.io";
    }

    @Override
    public void init() {

        String qcode = """
                            
                class InputStream
                            
                    cn InputStream()
                    
                    end
                    
                    fn input()
                        
                        var x = std::cin();
                        return x;
                        
                    end
                            
                end
                            
                class OutputStream
                            
                    cn OutputStream()
                    
                    end
                    
                    fn printline(x)
                        std::QAVB8KI72J65919YLC(x);
                    end
                    
                    fn out(x)
                        std::AX7MRSUXQ61G8DXIZW(x);
                    end
                    
                    fn newline()
                        std::QAVB8KI72J65919YLC();
                    end
                            
                end
                            
                """;
        Parser parser = new Parser().fromText(qcode);
        try {
            parser.parse(false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
