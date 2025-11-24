import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = s.nextInt();
        System.out.println("Enter second side: ");
        int b = s.nextInt();
        System.out.println(" Enter third side: ");
        int c = s.nextInt();
        if((a+b>c) && (b+c>a) && (c+a>b)) {

            if (a == b && b == c) {
                System.out.println(" The triangle is Equilateral. ");
            } else if (a == b || b == c) {
                System.out.println(" The triangle is Isosceles. ");
            } else {
                System.out.println(" The triangle is Scalene. ");
            }
        }
        else{
            System.out.println("The given sides do not form a valid Triangle.");
        }

    }
}
