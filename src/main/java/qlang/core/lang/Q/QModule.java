package qlang.core.lang.Q;

import java.util.HashMap;
import java.util.Map;

public class QModule {

    // basic module info
    public String name;
    public boolean isPublic;

    // each module regex info
    public Map<String, String> nameAndRegex = new HashMap<>();

    public boolean matches(String name, String regex) {
        return nameAndRegex.get(name).matches(regex);
    }

}
