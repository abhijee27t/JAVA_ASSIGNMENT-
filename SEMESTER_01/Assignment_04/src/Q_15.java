import java.util.*;
public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int sum = 0;
        int sumofsquares = 0;
        int i =1;
        while(i<=n) {
            sumofsquares= sumofsquares+i*i;
            sum = sum +i;
            i++;
        }
        int sqaureofsum = sum*sum;
        int difference = sqaureofsum-sumofsquares;
        System.out.println("Sum of square = " +sumofsquares);
        System.out.println("Square of sum =  " +sqaureofsum);
        System.out.println("Difference = " + difference);

    }
}
