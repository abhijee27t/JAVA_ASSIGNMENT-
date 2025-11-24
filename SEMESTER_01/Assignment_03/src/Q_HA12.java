import java.util.*;


public class Q_HA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //(a) Using nested if else statement
        if (a > b) {
            if (a > c) {
                System.out.println("Largest number: " + a);
            } else {
                System.out.println("Largest number: " + c);
            }
        }
        else if (b>c) {
            System.out.println("Largest number: " +b);
        }
        else {
            System.out.println("Largets number: " + c);
        }

        // (b) Using if else if ladder
        if(a>b && a>c) {
            System.out.println("Largest number: "+a);
        }
        else if(b>a && b>c) {
            System.out.println("Largest number: "+b);

        }
        else{
            System.out.println("Largest number: "+c);
        }

        //(c) Using Conditional (ternary) Operator
        int largest = (a>b) ? ((a>b) ? a: c) : ((b>c) ? b : c);
        System.out.println("Largest number: "+largest);
        sc.close();

    }
}