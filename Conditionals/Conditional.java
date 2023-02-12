import java.util.Scanner;

public class Conditional {
    public static void Calculator(int a, int b,char operator) {
        switch (operator) {
            case '+':
                System.out.println(a + b);
                  break;
            case '-':
                System.out.println(a - b);
                  break;
            case '*':
                System.out.println(a*b);
                  break;
            case '/':
                System.out.println(a / b);
                  break;
            case '%':
                System.out.println(a % b);
                  break;
                
            default:
                System.out.println("Wrong Operator");
                
        }
        
    }
    public static void passOrFail(int marks) {
        String reportCard = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(reportCard);
    }
    public static void taxCalculator(int income) {
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (500000 < income && income< 1000000) {
            tax = (int)(income*0.2);
        } else {
            tax = (int)(income*0.3);
        }
        System.out.print("tax for "+income+ " is "+ tax);
    }
    public static void GreatestOfThree(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("The numbers are equal");
            
        }
        
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest of three.");
            } else {
                System.out.println(c + " is greatest of three.");

            }
        }
        else if (b > c) {
            System.out.println(b + " is greatest of three.");
            
        } else if(c>b){
            System.out.println(c + " is greatest of three.");
            
        }
    }
    public static void oddEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even. ");
        }
        else if (n % 2 != 0) {
            System.out.println(n + "is Odd.");
        }

        
    }
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.print(a+ " is greater than "+ b);
        } else if (a<b) {
            System.out.print(a+ " lesser than "+ b);   
        } else {
            System.out.print(a+ " and "+ b+" are equal ");    
        }
    }
    public static void main(String args[]) {
        //Largest of 2 numbers
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char operator = scan.next().charAt(0);
        Calculator(a, b, operator);

        //int n = sc.nextInt();
        //oddEven(n);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //greater(a, b);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        //GreatestOfThree(a, b, c);
        //int income = sc.nextInt();
        //taxCalculator(income);
        //Ternary Operators
        // variable = condition? stmt1:stmt2
        //int number = 11;
        //ternary operator
        //String type = (number % 2 == 0) ? "Even" : "Odd";
        //System.out.println(type);

    }
    
}
