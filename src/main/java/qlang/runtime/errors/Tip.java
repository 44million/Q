package qlang.runtime.errors;

import com.github.tomaslanger.chalk.Chalk;

/**
 * The Tip class represents a tip system providing suggestions when errors occur.
 * It utilizes the Chalk library for text formatting.
 */
public class Tip {

    /**
     * The tip message formatted in yellow using Chalk.
     */
    private final String tip;

    /**
     * Constructs a Tip instance with the provided message.
     *
     * @param msg The message for the tip.
     */
    public Tip(String msg) {
        this.tip = ("[TIP] " + Chalk.on(msg).yellow());
    }

    /**
     * Retrieves the formatted tip message.
     *
     * @return The formatted tip message.
     */
    public String getTip() {
        return (Chalk.on(this.tip).yellow() + "\n");
    }
}
