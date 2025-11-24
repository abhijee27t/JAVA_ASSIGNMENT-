import java.util.*;

public class Q_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int N = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<N){
            if(i%3==0 || i%5==0) {
                 sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum: " +sum);
    }
}
