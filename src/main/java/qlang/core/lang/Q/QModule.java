package qlang.core.lang.Q;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a QModule, providing basic information about the module and regex information for each module.
 */
public class QModule {

    /**
     * The name of the module.
     */
    public String name;

    /**
     * Flag indicating whether the module is public.
     */
    public boolean isPublic;

    /**
     * Map to store regex information for each module.
     */
    public Map<String, String> nameAndRegex = new HashMap<>();

    /**
     * Checks if the provided name matches the specified regex for the module.
     *
     * @param name  The name of the module.
     * @param regex The regex to match against.
     * @return True if the name matches the regex, false otherwise.
     */
    public boolean matches(String name, String regex) {
        return nameAndRegex.get(name).matches(regex);
    }
}
