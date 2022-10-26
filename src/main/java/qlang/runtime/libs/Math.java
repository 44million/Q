package qlang.runtime.libs;

import qlang.core.internal.Parser;
import qlang.runtime.libs.util.QLibrary;

/*
    Math library. Don't even know if this is functional anymore, I haven't updated it in a long time.
 */

public class Math extends QLibrary {

    @SuppressWarnings("all")
    public static final String qcode = """
                        
            class Calculator {
                        
                cn Calculator():
                
                end
                        
                fn pow(x, y):
                    return x^y;
                end
                        
                fn fib(n):
              
                    if (n < 2):
                        return n;
                    else:
                        return fib(n - 1) + fib(n - 2);
                    end
                
                end

                fn fact(n):
                    if (n < 2):
                        return n;
                    else:
                        return n * fact(n - 1);
                    end
                end
                        
                fn sqrt(x):
                    return x^0.5;
                end

                fn triang(n):

                    var p1 = n + 1;
                    var mul = n * p1;

                    return mul / 2;
                end
                        
                fn density(mass, volume):
                    var d = mass / volume;
                    return d;
                end
                        
                fn density(mass, volume, density):
                    var d = density * mass / volume;
                    return d;
                end

                fn volume(mass, density):
                    var v = mass / density;
                    return v;
                end

                fn mass(volume, density):
                    var m = density * volume;
                    return m;
                end

                fn mass(volume, density, mass):
                    var m = mass * density / volume;
                    return m;
                end

                fn mph(distance, time):
                    var mph = distance / time;
                    return mph;
                end

                fn mph(distance, time, mph):
                    var mph = mph * distance / time;
                    return mph;
                end

                fn o(n):
                        
                    if (n < 2):
                        return 1;
                    else:
                        return n * o(n-1);
                    end
                        
                end
                        
                fn mul(x, y):
                    return x * y;
                end
                
                fn div(x, y):
                    return x / y;
                end
                
                fn mod(x, y):
                    return x % y;
                end
                        
            }
                        
            """;

    public String getName() {
        return "q.Math";
    }

    @Override
    public void init() {
        Parser.execBlock(qcode);
    }

}
