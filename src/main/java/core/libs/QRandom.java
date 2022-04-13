package core.libs;

import core.etc.Parser;
import core.libs.util.QLibrary;

public class QRandom extends QLibrary {

    @SuppressWarnings("all")
    private final String qcode
            = ("""      
            class Random
                        
                cn Random():
                
                end
                
                fn ran(x):
                    return 3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG(x);
                end
                        
            end
                        
            """);

    @Override
    public String getName() {
        return "q.Random";
    }

    @Override
    public void init() {
        Parser.execBlock(this.qcode);
    }

}
