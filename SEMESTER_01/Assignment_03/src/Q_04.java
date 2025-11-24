import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter user number: ");
        int b = s.nextInt();
        System.out.println("Enter user number: " +b);

        int  a = (int) (Math.random()*9)+1;
        System.out.println("Computer guesses: " + a);

        if(a==b) {
            System.out.println("\"You got it right\"");
        }
        else if (a == b +1) {
            System.out.println("\"Almost got it right\"");
        }
        else {
            System.out.println("You got it wrong");
        }

    }
}
