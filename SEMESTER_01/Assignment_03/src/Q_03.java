import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = s.nextInt();
        System.out.println("Input second number: ");
        int b  = s.nextInt();
        System.out.println("Input the third number: ");
        int c = s.nextInt();
        if(a<b && b<c) {
            System.out.println("\" Increasing \" ");
        }
        else if (a>b && b>c) {
            System.out.println("\" Decreasing \"");
        }
        else {
            System.out.println("\" Neither Increasing nor Decreasing \"");

        }
    }

}
