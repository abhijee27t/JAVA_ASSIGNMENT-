import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n= sc.nextInt();
        String s = "";
        for(int i=1; i<=n; i++) {    // n=4 , i<=4,
            s = s + i + s;
            System.out.println(s);

        }
    }
}
