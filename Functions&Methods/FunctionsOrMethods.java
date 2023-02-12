public class FunctionsOrMethods {
    //Functions written inside class is Method.
    //Parameter are of two types first is Parameters or Formal Parameters(At the time of function Definition) Second is Actual Parameters or Arguments(At the time of function call).
    //function occupy memory on call stack
    //memory occupied on call stack by function is called stack frame.
    //As soon as funtion's return statement is executed it vanishes from call stack
    //Java always Calls By Value 
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;
    }

    public static void primesInRange(int n){

        for (int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomialCoefficient(int n, int r) {
        //nCr = n!/r!(n-r)!
        int n_fact, r_fact, nmr_fact, bCoeff;
        n_fact = factorial(n);
        r_fact = factorial(r);
        nmr_fact = factorial(n - r);
        bCoeff = n_fact / (r_fact * nmr_fact);
        return bCoeff;
    }

    public static void binaryToDecimal(int n) {
        int pow = 0;
        int decNum = 0;
        int binNum = n;
        while (n > 0) {
            int lastDigit = n % 10;
            decNum = lastDigit * (int) (Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        System.out.println("Decimal Of " + binNum + " is = " + decNum);
    }

    public static void decToBin(int n) {
        int pow = 0;
        int decNum = n;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum += rem * (int) (Math.pow(10, pow));
            n = n / 2;
            pow++;

        }
        System.out.println("Binary of " + decNum + " is = " + binNum);
    }

    public static void averageOf3(int a, int b, int c) {
        System.out.println("Average is = " + (a + b + c) / 3);
    }

    public static void isEven(int num) {
        boolean var = (num % 2 == 0) ? true : false;
        System.out.println(var);
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev*10 + lastDigit;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPallindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;

    }
    public static void countNumberOfDigits(int n){
        int count =0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10; 
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
        //Syntax Of Function
        //returnType name(Parameter1,Parameter2){ 
        //body
        //return statement; }
        System.out.println(product(7, 4));
        System.out.println(factorial(4));
        System.out.println(binomialCoefficient(7, 4));
        System.out.println(isPrime(4));
        primesInRange(10);
        System.out.println();
        binaryToDecimal(101);
        decToBin(7);
        averageOf3(2, 4, 3);
        isEven(8);
        System.out.println(reverse(709));
        System.out.println(isPallindrome(12021));
        sumOfDigits(1234);
        countNumberOfDigits(12354);

    }
    
}
