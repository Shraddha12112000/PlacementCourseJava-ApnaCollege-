import java.util.*;

public class JavaBasics {
    public static void billCalculator(float pencil, float pen, float eraser) {
        float price = (pencil + pen + eraser);
        float bill = price + (price * 0.18f);
        System.out.print(bill);

    }
    public static void AreaOfSquare(double side) {
        double area = side * side;
        System.out.println(area);
    }
    public static void AverageOfThreeNumbers(float a, float b, float c) {
        float average = (a + b + c) / 3;
        System.out.print(average);

    }
    public static void areaOfCircle(float r) {
        float area = (3.14f) * (float)(Math.pow(r, 2));
        System.out.println("Area of circle is : "+ area);
    }
    public static void product(int a,int b){
        int c = a*b;
        System.out.println("Product is: "+c);
    }
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println("The Sum Of "+a+" and "+b+" is "+c);
    }
    public static void dataTypesInJava() {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        //float price = 10.5f;
        //int number = 25;
        //long(int), double(float)
        //short n = 240;


        // Two types of Data types in java 
        // Primitive Data Type & Non-Primitive Data Type
        /*Primitive Data Types
        1. byte (1 bytes) [-128 to 127] Total 256 numbers
        2. short (2 bytes)
        3. char (2 bytes)
        4. boolean (1 byte)
        5. int (4 bytes)
        6. long (8 bytes)
        7. float (4 bytes)
        8. double (8 bytes).
         /*
        Non Primitive Data Types
        1. String 
        2. Array
        3. Class 
        4. Object
        5. Interface
         */
        }
        public static void variablesInJava() {
        int a = 10;
        int b = 5;
        String name = "Tony Stark ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        a = 25;
        System.out.println(a);
        a = b;
        System.out.println(a);    
        
        } 
        public static void OutputInJava() {
        //prints output in same line
        System.out.print("Hello ");
        //prints output in next line 
        System.out.println("Hello ");
        //use "\n" with print to show output on same line
        System.out.print("Hello \n");
        
        }
        //Boilerplate Code
        public static void main(String args[]) {
        //Prints Hello World On Console
        System.out.print("Hello Shraddha!!! ");
        /*To run java code 
        browse to directory where this java file is created e.g. cd Desktop
        To compile code type :-
        javac filename.java
        To run code type:- java filename.java
        */
        //To take input from user we use Scanner class(already exists in java)
        //Scanner sc = new Scanner(System.in);
        
        //float pencil = sc.nextFloat();
        //float pen = sc.nextFloat();
        //float eraser = sc.nextFloat();
        //billCalculator(pencil, pen, eraser);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        //Names of variables are called identifiers in Java.Identifier rule says identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
        //double side = sc.nextDouble();
        //AreaOfSquare(side);
        //float a = sc.nextFloat();
        //float b = sc.nextFloat();
        //float c = sc.nextFloat();
        //AverageOfThreeNumbers(a, b, c);
        //float radius = sc.nextFloat();
        //areaOfCircle(radius);
        //sc is object of scanner class
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        // Capture only one word and after space or enter it doesn't store it in name.
        //String name = sc.next();
        //System.out.print(name);
        // To take whole sentence as an input 
        //String n = sc.nextLine();
        //System.out.println(n);
        //OutputInJava();
        //variablesInJava();
        //dataTypesInJava();
        //sum(a, b);
        /*
        boolean var = sc.nextBoolean();
        System.out.print(var);
        short va = sc.nextShort();
        System.out.println(va);
        long v = sc.nextLong();
        System.out.println(v);
        */
        
    }
    
}