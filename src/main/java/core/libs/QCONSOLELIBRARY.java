package core.libs;

import core.etc.Parser;
import core.etc.errors.Problem;
import core.libs.util.QLibrary;

public class QCONSOLELIBRARY extends QLibrary {

    @Override
    public String getName() {
        return "q.io";
    }

    @Override
    public void init() {

        String qcode = """
                                
                class InputStream
                            
                    cn InputStream():
                    
                    end
                    
                    fn input():
                        
                        var x = std::cin();
                        return x;
                        
                    end
                            
                end
                            
                class OutputStream
                            
                    cn OutputStream():
                    
                    end
                    
                    fn println(x):
                        std::QAVB8KI72J65919YLC(x);
                    end
                    
                    fn println():
                        std::QAVB8KI72J65919YLC();
                    end
                    
                    fn out(x):
                        std::AX7MRSUXQ61G8DXIZW(x);
                    end
                    
                    fn newline():
                        std::QAVB8KI72J65919YLC();
                    end
                            
                end
                            
                """;
        Parser parser = new Parser().fromText(qcode);
        try {
            parser.parse(false);
        } catch (Exception e) {
            throw new Problem(e.getMessage());
        }
    }
}
