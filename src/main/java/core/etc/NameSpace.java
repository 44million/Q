package core.etc;

import core.lang.q.QClass;

import java.util.ArrayList;
import java.util.List;

public class NameSpace {

    public List<QClass> classes = new ArrayList<>();
    public String id;

    public NameSpace(String id, QClass q) {
        this.id = id;
        this.classes.add(q);
    }

}
