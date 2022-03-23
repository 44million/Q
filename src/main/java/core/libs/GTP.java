package core.libs;

import com.simiacryptus.text.TextGenerator;
import com.simiacryptus.text.gpt2.GPT2Util;
import core.lang.Tip;
import core.libs.utils.QLibrary;

public class GTP extends QLibrary {

    TextGenerator textGenerator;

    @Override
    public String getName() {
        return "q.GTP";
    }

    @Override
    public void init() {
        new Tip("You have imported the GTP library, if you have not generated these files before:\nthe source downloads will take a significant amount of time");
        this.textGenerator = GPT2Util.get345M();
    }

    public String getText(int num) {
        return textGenerator.generateText(num);
    }

    public String getText(int num, String precix) {
        return textGenerator.generateText(num, precix);
    }

}
