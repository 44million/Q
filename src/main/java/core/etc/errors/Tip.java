package core.etc.errors;

import com.github.tomaslanger.chalk.Chalk;

public class Tip {

    private String tip;

    public Tip(String msg) {
        this.tip = ("[TIP] " + Chalk.on(msg).yellow());
    }

    public String getTip() {
        return this.tip;
    }
}
