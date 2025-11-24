import java.util.*;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = a;
        int sum = 0;
        while(b>0){
            int digit = b%10;
            sum=sum+digit;
            b=b/10;
        }
        if(a%sum==0) {
            System.out.println(a+ " is a Niven(Harshad) number");
        }
        else{
            System.out.println(a+ " is not a niven(Harshad) number.");
        }
    }
}
