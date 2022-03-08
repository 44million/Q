package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.util.Random;

public class QRandom extends QLibrary {

    @SuppressWarnings("all")
    private final String qcode
            = ("""
            #import q.Windows;
            #import q.Files;
            #import q.Math;
            #import q.Audio;
            #import q.http;
            #import q.Random;
            #import q.Console;
            #import q.Time;
                        
            class Random
                        
                cn Random()
                
                end
                
                fn ran(x)
                    return random(x);
                end
                        
            end
                        
            """);

    @Override
    public String getName() {
        return "q.Random";
    }

    public String ranInt() {
        Random r = new Random();
        return String.valueOf(r.nextInt());
    }

    @Override
    public void init() {
        Parser.execBlock(this.qcode);
    }

}
