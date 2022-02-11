package Q.QLang.lang;

import java.io.File;

public class QObject {

    public final String name;
    public final String fileName;
    public String block;
    public File file;

    public QObject(String name, String fileName, String block) {
        this.name = name;
        this.fileName = fileName;
        this.block = block;
    }

    public QObject(String name, String fileName, File file) {
        this.name = name;
        this.fileName = fileName;
        this.file = file;
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

    public void verify() {
        if (!this.file.exists()) {
            System.out.println("File not found");
            System.exit(0);
        }
    }

}