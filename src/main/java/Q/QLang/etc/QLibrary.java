package Q.QLang.etc;

public interface QLibrary {

    String[] getKeywords();

    String getBlock();

    String getName();

    void execFromKeyword(String keyword);


}
