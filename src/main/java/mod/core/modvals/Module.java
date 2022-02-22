package mod.core.modvals;

import java.util.ArrayList;
import java.util.List;

public class Module {

    public String id;
    public List<String> imports;
    public List<String> gits;

    public Module(String id, List<String> imports) {
        this.id = id;
        this.imports = imports;
        this.gits = new ArrayList<>();
    }

    public boolean contains(String s) {
        return imports.contains(s);
    }

    public void setId(String i) {
        this.id = i;
    }

}
