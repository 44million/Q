package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;
import java.util.Random;

public class QRandom extends QLibrary {

    @Override
    public String getName() {
        return "q.Random";
    }

    private final String qcode
            = String.format("""
            
            func ranInt()
                return %s;
            endf
            
            func pRandom()
                std:ln(%s);
            endf
            
            """, ranInt(), ranInt());

    public String ranInt() {
        Random r = new Random();
        return String.valueOf(r.nextInt());
    }

    public void init() {
        Parser parser = new Parser().fromText(this.qcode);
        try {
            parser.parse();
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
            System.exit(0);
        }
    }

}
