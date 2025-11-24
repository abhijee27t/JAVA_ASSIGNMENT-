import java.util.*;
public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;
        while(num>0) {
            int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of the number is  " +rev);
        if(original==rev) {
            System.out.println(original+ " is a palindrome");
        }
        else {
            System.out.println(original + " is not a palindrome");
        }










    }
}
