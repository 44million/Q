package qlang.core.lang.Q;

public class QYaml {

    private String name;
    private String type;
    private String version;
    private String author;
    private String homedir;

    public QYaml() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHomedir() {
        return homedir;
    }

    public void setHomedir(String homedir) {
        this.homedir = homedir;
    }
}
