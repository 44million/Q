package Q.QLang.lang;

import Q.QLang.etc.Parser;
import QParserAndLexer.lang.QParser;

import java.util.ArrayList;
import java.util.List;

public class QClass {

    public String name;
    public XCon xc;
    private List<Object> characteristics = new ArrayList<>();

    public QClass(List<Object> chars) {
        this.characteristics = chars;
    }

    public QClass(String name) {
        this.name = name;
    }

    public QClass() {
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
        private List<QParser.IndexesContext> params = new ArrayList<>();

        public XCon(List<QParser.IndexesContext> params, String block, String name) {
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
