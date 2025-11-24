import java.util.*;
public class Q_14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        int i = 1;
        int sum1 =0;
        int sum2 = 1;
        while(i<=N) {
            if (i % 2 == 0) {
                 sum1 = sum1 + i;

            } if(i%2!=0) {
                 sum2 = sum2*i;
            }i++;
        }
        System.out.println("Sum of all even numbers = " +sum1);
        System.out.println("Product of all odd numbers = " +sum2);


    }
}
