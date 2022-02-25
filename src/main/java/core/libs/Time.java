package core.libs;

import core.etc.Parser;
import core.lang.q.QValue;
import core.libs.utils.QLibrary;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;

public class Time extends QLibrary {

    private final String qcode = String.format(
            """
                    #import q.Windows;
                    #import q.Files;
                    #import q.Math;
                    #import q.Audio;
                    #import q.http;
                    #import q.Random;
                    #import q.Console;
                    #import q.Time;
                                
                    func EAL()
                        return "%s";
                    end
                                        
                    func IAL()
                        return "%s";
                    end
                                
                    """, Instant.now().toEpochMilli(), Instant.now().toString());

    public static QValue cur() {
        String time = "";

        LocalDateTime i = LocalDateTime.now();

        time += i.getHour();
        time += ":";
        time += i.getMinute();
        time += ":";
        time += i.getSecond();

        return new QValue(time);
    }

    public static QValue date() {
        String date = "";

        date += LocalDateTime
                .now().getDayOfMonth();
        date += "/";
        date += LocalDateTime
                .now().getMonth().getValue();
        date += "/";
        date += LocalDateTime
                .now().getYear();

        return new QValue(date);
    }

    public static QValue instant() {
        String s = Instant.now().toString();
        return new QValue(s);
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
