import java.util.*;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        while(num>0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if(sum%9==0) {
            System.out.println(original+ " is divisible by nine.");
        }
        else {
            System.out.println(original+ " is not divisible by nine.");

        }

    }
}
