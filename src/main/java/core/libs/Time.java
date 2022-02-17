package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;
import java.time.Instant;

public class Time extends QLibrary {

    private final String qcode = String.format(
            """
                                
                    func EAL()
                        return "%s";
                    endf
                                        
                    func IAL()
                        return "%s";
                    endf
                                
                    """, Instant.now().toEpochMilli(), Instant.now().toString());

    @Override
    public String getName() {
        return "q.time";
    }

    @Override
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
