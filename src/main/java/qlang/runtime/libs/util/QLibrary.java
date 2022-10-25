package qlang.runtime.libs.util;

/*
    this class is literally just for some polymorphism stuff i might do later on, with hashmaps.
 */

public abstract class QLibrary {

    abstract public String getName();

    abstract public void init();

    public void setText(String s) {
    }

}
