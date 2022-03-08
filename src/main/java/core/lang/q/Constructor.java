package core.lang.q;

import java.util.HashMap;
import java.util.List;

public class Constructor {

    private String id;
    private List<QValue> q;
    public HashMap<String, QValue> qc;

    public Constructor(String id, List<QValue> q) {
        this.id = id;
        this.q = q;
    }

    public Constructor(String id, HashMap<String, QValue> q) {
        this.id = id;
        this.qc = q;
    }

}
