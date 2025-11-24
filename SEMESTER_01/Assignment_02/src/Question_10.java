import java.util.Scanner;


public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Enter the Distance in km =  " +a);
        int b = a*1000;
        System.out.println(a+ " km is " +b+ " meters");
        double d = a*3280.8399;
        System.out.println(a+ " km is " +d+ " feet ");
        double e = a*39370.0787;
        System.out.println(a+ " km is " +e+ " inch ");
        double f = a*100000;
        System.out.println(a+ " km is " +f+ " centimeters");



    }
}