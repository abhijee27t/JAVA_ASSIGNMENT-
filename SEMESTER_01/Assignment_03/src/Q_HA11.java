import java.util.*;

public class Q_HA11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:  ");
        int a = sc.nextInt();
        if((a%5==0 && a%6==0) || (a%5==0 || a%6==0) || ((a%5==0) ^ (a%6==0)) ){
            boolean b = (a % 5 == 0 && a % 6 == 0);
            boolean b1 = (a%5==0 || a%6==0);
            boolean b2 = ((a%5==0) ^ (a%6==0));
            System.out.println("Is 10 divisible by 5 and 6? " + b);
            System.out.println("Is 10 divisible by 5 or 6? " +b1);
            System.out.println("Is 10 divisible by 5 or 6, but not both? " +b2);
        }
    }
}
