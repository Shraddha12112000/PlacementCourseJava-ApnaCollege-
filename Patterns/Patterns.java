import java.util.*;
public class Patterns {
    //print Star Pattern
    /* 
    1. lines = outer loop =4=i in this case
    2. inner loop = number of times (star) = lines time=i times
    
    *       line=1 star =1
    **      line=2 star =2
    ***     line=3 star =3
    ****    line=4 star =4
    
    */
    public static void starPattern() {
        for (int i = 1; i <= 8; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void hollowRectangle(int total_rows,int total_cols) {
        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_cols; j++) {
                //cell (i,j)
                if (i == 1 || i == total_rows || j == 1 || j == total_cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
    public static void invertedStar() {
        for (int i = 1; i <= 4; i++) {
            for (int star = 1; star <= 4 - i + 1; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    /* 
    1
    12
    123
    1234
    */
    public static void halfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
/*
    *           line =1 star =1 space =4 stars = 2(line)-1
   ***          line =2 star =3 space =3 spaces= n - line
  *****         line =3 star =5 space =2
 *******        line =4 star =7 space =1
*********       line =5 star =9 space =0
*/


public static void fullPyramid() {
    for (int i = 1; i <= 5; i++) {
        //spaces
        for (int space = 1; space <= 5 - i; space++) {
            System.out.print(" ");

        } //stars
        for (int star = 1; star <= (2 * (i) - 1); star++) {
            System.out.print("*");

        }
        System.out.println();
    }
}
public static void inverted_Rotated_Half_Pyramid(int total_rows, int total_cols) {
    /*
       *   line = 1 spaces =3 n-line stars =1 stars =i
      **   line = 2 spaces =2 stars =2 spaces=
     ***   line = 3 spaces =1 stars =3
    ****   line = 4 spaces =0 stars =4
    */
    for (int i = 1; i <= total_rows; i++) {
        //spaces
        for (int space = 1; space <= total_rows - i; space++) {
            System.out.print(" ");
        }
        //stars
        for (int star = 1; star <= i; star++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void characterPattern() {
    char ch = 'A';
    //outer loop
    for (int line = 1; line <= 7; line++) {
        //inner loop
        for (int chars = 1; chars <= line; chars++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}

public static void FloydTriangle() {
    /*
    1                 line = 1 number = line   
    2  3              
    4  5  6
    7  8  9  10
    11 12 13 14 15
    */
    int num = 1;
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}

public static void zero_ones_Triangle() {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0) {
                //even 
                System.out.print("1");
            } else {
                System.out.print("0");

            }

        }
        System.out.println();
        }
    }

    public static void main(String args[]) {
        starPattern();
        invertedStar();
        halfPyramid();
        fullPyramid();
        characterPattern();
        //System.out.println("Enter Total Rows  : ");
        //Scanner sc = new Scanner(System.in);
        //int total_rows = sc.nextInt();
        //System.out.println("Enter Total Columns  : ");
        //int total_cols = sc.nextInt();
        inverted_Rotated_Half_Pyramid(9,8);

        FloydTriangle();
        //hollowRectangle(total_rows,total_cols);
        zero_ones_Triangle();
    }
    
}
