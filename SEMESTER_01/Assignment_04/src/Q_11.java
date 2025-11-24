import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp=num;
        int sum = 0;
        int i =1;
        while(i<=num/2){
            if(num%i==0) {
                sum = sum + i;
            }i++;

        } if(sum==num){
           System.out.println(temp+ " is a perfect number ");
        }  else{
           System.out.println(temp+ " is not a perfect number ");
        }
    }
}
