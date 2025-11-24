import java.util.*;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        int original_num= num;
        int result = 0;
        int place = 1;
        while(num>0){
            int digit = num%10;
            if(digit!=0){
                result = result+digit*place;
                place= place*10;
            }
            num=num/10;
        }
        System.out.println("After removing 0 from number"+original_num+"the new number is "+result);
    }
}
