package qlang.runtime.libs;

import qlang.core.internal.Parser;
import qlang.runtime.libs.util.QLibrary;

/*
    Random file, don't know if this even works anymore.
 */

public class QRandom extends QLibrary {

    @SuppressWarnings("all")
    private final String qcode
            = ("""      
            class Random {
                        
                cn Random():
                
                end
                
                fn ran(x):
                    return 3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG(x);
                end
                        
            }
                        
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
