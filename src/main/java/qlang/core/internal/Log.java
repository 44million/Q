package qlang.core.internal;

import com.github.tomaslanger.chalk.Chalk;

/**
 * Simple logging utility class for different severity levels.
 */
public class Log {

    /**
     * Logs a message with the specified severity level.
     *
     * @param s       The severity level of the message.
     * @param message The message to be logged.
     */
    public static void log(Severity s, String message) {
        if (s.equals(Severity.FATAL)) {
            System.err.println("[FATAL] " + message);
        } else if (s.equals(Severity.ERROR)) {
            System.err.println("[ERROR] " + message);
        } else if (s.equals(Severity.WARNING)) {
            // Use Chalk library for colored output
            System.out.println(Chalk.on("[WARNING] " + message).bgYellow());
        } else if (s.equals(Severity.TIP)) {
            // Use Chalk library for colored output
            System.out.println(Chalk.on("[TIP] " + message).bgGreen());
        }
    }

    public static void silent(Severity s, String message) {
        // TODO: Implement silent logging
    }

    /**
     * Enum representing different severity levels for logging.
     */
    public enum Severity {
        FATAL,
        ERROR,
        WARNING,
        TIP
    }
}
