package qlang.runtime.STDLibs.util;

/*
    this class is literally just for some polymorphism stuff i might do later on, with hashmaps.
 */

public abstract class QLibrary {

    /**
     * @return String       This is the abstract method which returns the Q package names, returned as a String.
     */
    abstract public String getName();

    abstract public void init();

    public void setText(String s) {
    }

}
