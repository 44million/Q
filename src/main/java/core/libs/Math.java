package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

public class Math extends QLibrary {

    @SuppressWarnings("all")
    private final String qcode = """
            #import q.Windows;
            #import q.Files;
            #import q.Math;
            #import q.Audio;
            #import q.http;
            #import q.Random;
            #import q.Console;
            #import q.Time;
                        
            func pow(x, y)
                return x^y;
            end
                        
            func fib(n)
              
                if (n < 2)
                    return n;
                else
                    return fib(n - 1) + fib(n - 2);
                end

            end

            func fact(n)
                if (n < 2)
                    return n;
                else
                    return n * fact(n-1);
                end

            end
                        
            func sqrt(x)
                return x^0.5;
            end

            func triang(n)

                p1 = n + 1;
                mul = n * p1;

                return mul / 2;
            end
                        
            func density(mass, volume)
                d = mass / volume;
                return d;
            end
                        
            func density(mass, volume, density)
                d = density * mass / volume;
                return d;
            end

            func volume(mass, density)
                v = mass / density;
                return v;
            end

            func mass(volume, density)
                m = density * volume;
                return m;
            end

            func mass(volume, density, mass)
                m = mass * density / volume;
                return m;
            end

            func mph(distance, time)
                mph = distance / time;
                return mph;
            end

            func mph(distance, time, mph)
                mph = mph * distance / time;
                return mph;
            end

            func o(n)
                        
                if (n < 2)
                    return 1;
                else
                    return n * o(n-1);
                end
                        
            end
                        
            class Calculator
                        
                const Calculator()
                
                end
                
                func mul(x, y)
                    return x * y;
                end
                
                func div(x, y)
                    return x / y;
                end
                
                func mod(x, y)
                    return x % y;
                end
                        
            end
                        
            """;

    public String getName() {
        return "q.Math";
    }

    @Override
    public void init() {
        Parser.execBlock(this.qcode);
    }

}
