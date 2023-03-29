public class RecursionBasics {
    public static void printDec(int n) {
        //Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        //work
        //f(n)=n+f(n-1)
        System.out.print(n + " ");
        printDec(n - 1);

    }
    //Stack Overflow
    //Many parameters at the time of recursion 
    //Memory consumption very high (parameters)
    //too many recursion calls (stack will become full)
    // error called "Stack Overflow" Program will crash
    //There should be always a base case .(Prevention)
    public static void printInc(int n) {
        //Base Case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        //Work
        //f(n)=f(n-1)+n

        printInc(n - 1); // Recursion
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        //Base Case
        if (n == 0) {
            return 1;
        }
        //work
        //f(n)=n*f(n-1)
        int fact_nm1 = factorial(n - 1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    // Sum of n natural numbers
    public static int sum(int n) {
        //Base Case
        if (n == 1) {
            return n;
        }
        //work
        //f(n)=n+f(n-1)
        int fnm1 = sum(n - 1);
        int fn = n + fnm1;
        return fn;
    }

    public static long fibonacci(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        //work
        //f(n+2)=f(n+1)+f(n)
        long fib_nm2 = fibonacci(n - 2);
        long fib_nm1 = fibonacci(n - 1);
        long fib_n = fib_nm2 + fib_nm1;
        return fib_n;
    }

    public static boolean isSorted(int[] arr, int i) {
        //Base Case
        if (i == arr.length - 1) {
            return true;
        }
        //work
        //isSorted(n)=arr[i]<arr[i+1]+isSorted(n-1)
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int[] arr, int i, int key) {
        //Base Case
        if (i == arr.length) {
            return -1;
        }
        //Work
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        //Check with self

        return isFound;

    }

    public static long power(long x, long n) {

        /* TC=O(n) Brute Force - Recursion
        Base Case
        if (n == 0) {
            return 1;
        }
        //Work
        //pow(x,n)=x*pow(x,n-1)
        long x_nm1 = power(x, n - 1);
        long x_n = x * x_nm1;
        return x_n;*/
        //Optimized Code TC = O(log n)
        //n=even x^n= 2^10= x^n/2 *x^n/2
        //n=odd x^n = 2^5 = x^n/2 *x^n/2* x
        //n/2^l =1 that means l=log2(n) l= levels
        //Base Case
        if (n == 0) {
            return 1;
        }
        //n is even
        long xnb2 = power(x, n / 2);
        if (n % 2 == 0) {

            return xnb2 * xnb2;
        } else {
            // n is odd
            return x * xnb2 * xnb2;
        }

    }

    public static int tilingProblem(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        //2*n (floor size)
        //Work
        //Vertical Choice
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);
        return fnm1 + fnm2;

    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        //Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        //Base case
        if (n == 1 || n == 2) {
            return n;

        }
        //choice
        //single
        int fnm1 = friendsPairing(n - 1);
        //pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;
        return fnm1 + pairWays;

    }

    public static void binaryStrings(int n, int lastPlace, String str) {
        //Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryStrings(n - 1, 1, str + "1");
        }

    }

    public static void occurence(int[] arr, int i, int key) {
        //Base case
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        occurence(arr, i + 1, key);

    }
    static String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToString(int n) {
        
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numToString(n / 10);
        System.out.print(digits[lastDigit]+" ");
    }
        


    public static void main(String[] args) {
        String str = "asdsdfgh";
        //printDec(n);
        //printInc(num);
        int[] arr = { 1, 7, 5, 5, 5 };
        //removeDuplicates(str,0,new StringBuilder(""),new boolean[26])
        //System.out.print(friendsPairing(2));
        //binaryStrings(4,0,"");
        //occurence(arr, 0, 5);
        //numToString(2019);
        System.out.print(lengthOfString(str, 0));

    }

    public static int lengthOfString(String str, int i) {
        //Base Case
        if(str.length()==i)
            return i;
        return lengthOfString(str, i + 1);
        
    }

    
}