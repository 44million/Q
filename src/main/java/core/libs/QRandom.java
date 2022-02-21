package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.util.Random;

public class QRandom extends QLibrary {

    private final String qcode
            = String.format("""
            #import q.Windows;
            #import q.Files;
            #import q.Math;
            #import q.Audio;
            #import q.http;
            #import q.Random;
            #import q.Console;
            #import q.Time;
                        
            func ranInt()
                return %s;
            endf
                        
            func pRandom()
                std:ln(%s);
            endf
                        
            """, ranInt(), ranInt());

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