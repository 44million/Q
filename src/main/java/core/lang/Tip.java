package core.lang;

import core.etc.Environment;

public class Tip {
    public Tip(String message) {
        if (Environment.global.tips) {
            System.err.println("[TIP] " + message);
        } else {
            return;
        }
    }
}
