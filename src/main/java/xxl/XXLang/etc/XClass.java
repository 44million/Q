package xxl.XXLang.etc;

import xxl.lang.XXLParser;

import java.util.ArrayList;
import java.util.List;

public class XClass {

    public String name;
    public XCon xc;
    private List<Object> characteristics = new ArrayList<>();

    public XClass(List<Object> chars) {
        this.characteristics = chars;
    }

    public XClass(String name) {
        this.name = name;
    }

    public XClass() {
    }

    public List<Object> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Object> characteristics) {
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XCon getXc() {
        return xc;
    }

    public void setXc(XCon xc) {
        this.xc = xc;
    }

    public void execCon() {
        this.xc.exec();
    }

    static class XCon {

        private final String block;
        public String name;
        private List<XXLParser.IndexesContext> params = new ArrayList<>();

        public XCon(List<XXLParser.IndexesContext> params, String block, String name) {
            this.block = block;
            this.params = params;
            this.name = name;
        }

        public void exec() {
            Parser parser = new Parser().fromText(this.block);
            parser.parseSafe();
        }

    }

}
