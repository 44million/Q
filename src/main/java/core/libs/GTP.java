package core.libs;

import com.simiacryptus.text.TextGenerator;
import com.simiacryptus.text.gpt2.GPT2Util;
import core.libs.utils.QLibrary;

public class GTP extends QLibrary {

    TextGenerator textGenerator = GPT2Util.get345M();

    @Override
    public String getName() {
        return "q.GTP";
    }

    @Override
    public void init() {
    }

    public String getText(int num) {
        return textGenerator.generateText(num);
    }

    public String getText(int num, String precix) {
        return textGenerator.generateText(num, precix);
    }

}
