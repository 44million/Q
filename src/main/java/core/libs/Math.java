package core.libs;

import core.libs.utils.QLibrary;

public class Math implements QLibrary {

    @Override
    public String getName() {
        return "q.Math";
    }

    private final String qcode = """
            
            func pow(x, y)
                return x^y;
            endf
            
            func fib
            
            
            
            endf
            
            """;

}
