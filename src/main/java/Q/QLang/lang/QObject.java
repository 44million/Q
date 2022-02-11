package Q.QLang.lang;

public class QObject {

    public final String name;
    public final String fileName;
    public String block;

    public QObject(String name, String fileName, String block) {
        this.name = name;
        this.fileName = fileName;
        this.block = block;
    }

    public String toString() {
        return "QObject(" + name + ")";
    }

    public boolean exists() {
        return true;
    }

    public void delete() {
        lang.objects.remove(this);
    }

}