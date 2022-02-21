package core.lang.q;

import java.util.ArrayList;
import java.util.List;

public class QClass {

    public String name;
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

}
