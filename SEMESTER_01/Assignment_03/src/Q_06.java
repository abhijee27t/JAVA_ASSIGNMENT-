import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = b*b-4*a*c;
        double r1 = (-b + Math.pow(D,0.5))/2*a;
        double r2 = (-b - Math.pow(D,0.5))/2*a;
        if(D>0 ) {
            System.out.println( "The equation has two roots : " + r1+ " " +r2);
        } else if (D==0) {
            System.out.println("The equation has one root: " + r1);
        } else  {
            System.out.println("The equation has no real roots ");
        }
    }
}
