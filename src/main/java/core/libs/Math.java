package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

import java.io.IOException;

public class Math implements QLibrary {

    @Override
    public String getName() {
        return "q.Math";
    }

    private final String qcode = """
            
            func pow(x, y)
                return x^y;
            endf
            
            func fib(n)
              
                if (n < 2) do
                    return n;
                else do
                    return fib(n-1) + fib(n-2);
                endf

            endf

            func fact(n)
                if (n < 2) do
                    return n;
                else do
                    return n * fact(n-1);
                endf

            endf
            
            func sqrt(x)
                return x^0.5;
            endf

            func triang(n)

                p1 = n + 1;
                mul = n * p1;

                return mul / 2;
            endf
            
            func density(mass, volume)
                d = mass / volume;
                return d;
            endf
            
            func density(mass, volume, density)
                d = density * mass / volume;
                return d;
            endf

            func volume(mass, density)
                v = mass / density;
                return v;
            endf

            func mass(volume, density)
                m = density * volume;
                return m;
            endf

            func mass(volume, density, mass)
                m = mass * density / volume;
                return m;
            endf

            func mph(distance, time)
                mph = distance / time;
                return mph;
            endf

            func mph(distance, time, mph)
                mph = mph * distance / time;
                return mph;
            endf
            
            """;

    public void init() {

        Parser p = new Parser().fromText(this.qcode);
        try {
            p.parse();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
