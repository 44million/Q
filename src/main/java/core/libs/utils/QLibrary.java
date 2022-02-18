package core.libs.utils;

import core.libs.AWT.QComponent;

public abstract class QLibrary {

    // this class is literally just for some polymorphism stuff i might do later on, with hashmaps.

    abstract public String getName();

    abstract public void init();

    public void setText(String s) {}

}
