import java.util.*;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int i;
        System.out.println("Using for loop from 1 to 3");
        for( i=1; i<=3; i++ ) {
            System.out.println(n+ " x " +i+ " = " +n*i);
        }
        System.out.println("Using while loop from 4 to 6");
        while(i>3 && i<=6) {
            System.out.println(n+ " x " +i+ " = " +n*i);
            i++;
        }
        System.out.println("Using do while loop from 7to 10 ");
        do{
            System.out.println(n+ " x " +i+ " = " +n*i);
            i++;

        }while (i>6 && i<=10);
    }


}
