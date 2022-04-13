package core.etc.errors;

import com.github.tomaslanger.chalk.Chalk;

public class Tip {

    private final String tip;

    public Tip(String msg) {
        this.tip = ("[TIP] " + Chalk.on(msg).yellow());
    }

    public String getTip() {
        return this.tip;
    }

    @SuppressWarnings("unused")
    public void printTip() {
        System.out.println(Chalk.on(this.tip).yellow());
    }
}
