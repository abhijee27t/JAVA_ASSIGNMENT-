import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter number of eggs: " +N);
        int gross = N/144;
        int remaningaftergross = N%144;
        int dozen = remaningaftergross/12;
        int reamingeggs = remaningaftergross%12;
        System.out.println("Total number of eggs is " +gross+ " gross, " +dozen+ " dozen, and " +reamingeggs);

    }
}
