package Q.QLang.etc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Installer {

    private final String math =
            """
                                        
                         // Math library file
                                                    
                         var pi = 3.1415926535;
                                                    
                         func isEven(n)\s
                             var result = false;
                             if n % 2 == 0 do
                                 result = true;
                             else do
                                 result = false;
                             endf
                             return result;
                         endf   \s
                                                    
                         func pow(x, y)
                             var result = x ^ y;
                                                    
                             return result;
                         endf
                                                    
                         func fact(n)
                             var result = 1;
                             for i = 1 to n do
                                 result = result * i;
                             endf
                             return result;
                         endf
                                                    
                         func fib(n)
                             if n == 0 do
                                 return 0;
                             else if n == 1 do
                                 return 1;
                             else do
                                 return fib(n - 1) + fib(n - 2);
                             endf
                         endf
                                                    
                         func sqrt(n)
                             var result = 0;
                             for i = 1 to n do
                                 result = result + i;
                             endf
                             return result;
                         endf
                                                    
                         func isPrime(n)
                             var result = true;
                             for i = 2 to n - 1 do
                                 if n % i == 0 do
                                     result = false;
                                 endf
                             endf
                             return result;
                         endf
                                                    
                         func gcd(a, b)
                             if b == 0 do
                                 return a;
                             else do
                                 return gcd(b, a % b);
                             endf
                         endf
                    """;

    public Installer() {
    }

    public void install() {

        File start = new File(System.getProperty("user.home") + "/");

        String s = start.getPath();
        if (!s.endsWith("/")) {
            s += "/";
        }

        File dir = new File(s + ".XXLsys/");
        s += ".XXLsys/";

        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (Exception e) {
                System.out.println("ERROR: CANNOT CREATE PATH AT: [" + s + "]");
                System.exit(-1);
            }
        }

        FileWriter f = null;

        File ff = new File(s + "Math.l");

        if (!ff.exists()) {
            try {
                ff.createNewFile();
            } catch (Exception e) {
                System.out.println("ERROR: CANNOT CREATE PATH AT: [" + ff.getPath() + "]");
                System.out.println(e.getMessage());
                System.exit(-1);
            }
        }

        try {
            f = new FileWriter(ff);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        try {
            f.write(this.math);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

    }

}
