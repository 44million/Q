package qlang.core.internal;

import qlang.core.lang.Q.QClass;

import java.util.ArrayList;
import java.util.List;

/*
    For a package library I'm currently working on
 */

public class NameSpace {

    public List<QClass> classes = new ArrayList<>();
    public String id;

    public NameSpace(String id, QClass q) {
        this.id = id;
        this.classes.add(q);
    }

}
