// Math library file

var pi = 3.1415926535;

func isEven(n) 
    var result = false;
    if n % 2 == 0 do
        result = true;
    else do
        result = false;
    endf
    return result;
endf    

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
