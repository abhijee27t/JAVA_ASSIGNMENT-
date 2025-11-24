import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of steps walked: ");
        int steps = a.nextInt();
        if (steps >= 10000) {
            System.out.println("Good Job! You are active today. ");
        } else {
            System.out.println("You need to walk more for good health. ");


        }
    }
}
