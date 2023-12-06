package qlang.core.lang;

import qlang.core.lang.Q.QClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a namespace for a package library currently under development.
 */
public class NameSpace {

    // List of QClass objects within the namespace
    public List<QClass> classes = new ArrayList<>();

    // Identifier for the namespace
    public String id;

    /**
     * Constructor for the NameSpace class.
     *
     * @param id The identifier for the namespace.
     * @param q  The QClass object to be added to the namespace.
     */
    public NameSpace(String id, QClass q) {
        this.id = id;
        this.classes.add(q);
    }
}
