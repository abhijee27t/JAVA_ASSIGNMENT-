import java.util.*;
public class Q_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int originala = a;
        int originalb = b;
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        System.out.println(" GCD of " +originala+ " and " +originalb+ " is " +a );
    }
}
