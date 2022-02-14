package core.libs;

public interface QLibrary {

    String[] getKeywords();

    String getBlock();

    String getName();

    void execFromKeyword(String keyword);


}
