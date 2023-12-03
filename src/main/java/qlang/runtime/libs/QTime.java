package qlang.runtime.libs;

import qlang.core.internal.Parser;
import qlang.core.lang.Q.Value;
import qlang.runtime.libs.util.QLibrary;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;

/*
    Time library, tbh idk if this ever worked. Gonna delete this and replace it in NativeFunctionLoader.java
 */

public class QTime extends QLibrary {

    private final String qcode = String.format(
            """
                                
                    fn EAL():
                        return "%s";
                    end
                                        
                    fn IAL():
                        return "%s";
                    end
                                
                    """, Instant.now().toEpochMilli(), Instant.now().toString());

    /**
     *
     * @return Value        The current time as a Q Value variable.
     */
    public Value cur() {
        String time = "";

        LocalDateTime i = LocalDateTime.now();

        time += i.getHour();
        time += ":";
        time += i.getMinute();
        time += ":";
        time += i.getSecond();

        return new Value(time);
    }

    /**
     *
     * @return Value        Current date as a Q Value variable
     */
    public Value date() {
        String date = "";

        date += LocalDateTime
                .now().getDayOfMonth();
        date += "/";
        date += LocalDateTime
                .now().getMonth().getValue();
        date += "/";
        date += LocalDateTime
                .now().getYear();

        return new Value(date);
    }

    /**
     *
     * @return Value        The current instant as a Q Value variable
     */
    public Value instant() {
        String s = Instant.now().toString();
        return new Value(s);
    }

    /**
     *
     * @return String       The class name, in this case 'q.time'
     */
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
