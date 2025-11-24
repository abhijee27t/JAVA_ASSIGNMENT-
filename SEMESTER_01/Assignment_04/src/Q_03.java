import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Enter a number (0 to stop) : " );
            n= sc.nextInt();


            if (n!=0){
                if(n%2==0) {
                    System.out.println(n + "is an even number.");
                } else {
                        System.out.println(n+ "is an odd number" );
                }
            }
        }while(n!=0);
        System.out.println("Program Terminated");


    }
}
