import java.util.Scanner;

public class Q_HA13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a>0 && b>0) {
            System.out.println("("+a+", "+b+") is in quadrant I ");
        }
        else if (a<0 && b>0) {
            System.out.println("("+a+", "+b+") is in quadrant II ");
        }
        else if(a<0 && b<0) {
            System.out.println("("+a+", "+b+") is in quadrant III");
        }
        else if (a>0 && b<0) {
            System.out.println("("+a+", "+b+") is in quadrant IV ");
        }
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if(c==0 && d!=0) {
            System.out.println("("+c+ "," +b+ ") is on y-axis ");
        }
        else {
            System.out.println("("+c+ "," +b+ ") is on x-axis ");

        }
    }
}
