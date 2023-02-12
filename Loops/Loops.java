import java.util.*;

public class Loops {
    public static void primeOrNot(int num) {
        if (num == 2) {
            System.out.println(num + " is prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
            System.out.println(num + " is prime ");
        } else {
            System.out.println(num + " is not prime ");
                
            }
        }
        
    }
    public static void reverseNumber(int n) {
        int rev =0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void main(String args[]) {
        //System.out.print("Enter number which you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        //int n = sc.nextInt();
        //reverseNumber(n);
        //primeOrNot(num);
        /*for (int i = 0; i < 5; i++) {
            System.out.println(i);

            System.out.println("Hello");
            System.out.println(i);

            i += 2;
            System.out.println(i);*/
            int oddSum =0;
            int evenSum =0;
            for (int i = 0; i < 10; i++) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    //even 
                    evenSum = evenSum + n;
                } else {
                    //odd
                    oddSum = oddSum + n;
                }
            }
            System.out.println("odd sum : " + oddSum);
            System.out.println("even sum : " + evenSum);

            
            
            
        } }


