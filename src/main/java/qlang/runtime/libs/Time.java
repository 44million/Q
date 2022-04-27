package qlang.runtime.libs;

import qlang.core.internal.Parser;
import qlang.core.lang.q.Value;
import qlang.runtime.libs.util.QLibrary;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;

public class Time extends QLibrary {

    private final String qcode = String.format(
            """
                                
                    fn EAL():
                        return "%s";
                    end
                                        
                    fn IAL():
                        return "%s";
                    end
                                
                    """, Instant.now().toEpochMilli(), Instant.now().toString());

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

    public Value instant() {
        String s = Instant.now().toString();
        return new Value(s);
    }

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
