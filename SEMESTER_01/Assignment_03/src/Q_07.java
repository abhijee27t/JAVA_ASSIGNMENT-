import java.util.*;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        // (a) Using nested if else statement
        if(year%100==0) {
            if(year%400==0) {
                System.out.println(year+ " is a Leap Year.  ");
            }
            else {
                System.out.println(year+ " is NOT a Leap Year. ");
            }
        }
        else if ((year%4==0) ) {
            System.out.println(year+ " is  a Leap Year. ");
        }
        else {
            System.out.println(year+ " is NOT a Leap year. ");
        }

        // (b) Using if else if ladder statement
        if(year%400==0 ) {
            System.out.println(year+ "is a Leap Year");
        }
        else if (year%100==0) {
            System.out.println(year+ "is not a Leap year. ");
        }
        else if (year%4==0) {
            System.out.println(year+ "is a Leap year.");
        }
        else{
            System.out.println(year + "is not a Leap year ");
        }

        // (c) Using Conditional (Ternary) Operator
        String result = ((year % 4==0 && year%100!=0) || (year%400==0)) ? (year+ "is a leap year"): (year+"is not a Leap year");
        System.out.println(result);

    }
}

