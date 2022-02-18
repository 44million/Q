package core.libs;

import core.etc.Parser;
import core.libs.utils.QLibrary;

public class Math extends QLibrary {

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
            endf
                        
            func fib(n)
              
                if (n < 2) do
                    return n;
                else do
                    return fib(n - 1) + fib(n - 2);
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

            func o(n)
                        
                if (n < 2) do
                    return 1;
                else do
                    return n * o(n-1);
                endf
                        
            endf
                        
            """;

    public String getName() {
        return "q.Math";
    }

    @Override
    public void init() {
        Parser.execBlock(this.qcode);
    }

}
