package core.libs.collections;

public class List<T> implements java.io.Serializable{

    private java.util.List<T> list = new java.util.ArrayList<>();
    public String id;

    public List(String id) {
        this.id = id;
    }

    public void add(T o) {
        this.list.add(o);
    }

    public void remove(T o) {
        this.list.remove(o);
    }

    public void print() {
        for (T t : this.list) {
            System.out.println(t.toString());
        }
    }

}
