import java.util.*;

public class Q_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        System.out.println("Enter second number: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Enter operator (+,-,*,/) : ");
        char x = s.next().charAt(0);
        switch(x) {
            case '+':
                System.out.println("Addition: " + (a+b));
                break;
            case '-':
                System.out.println("Substraction: " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication: " +(a*b));
                break;
            case '/':
                if(b==0) {
                    System.out.println("Division by zero error ");
                }
                else {
                    System.out.println("Division: " +a/b);

                }
        }
    }
}
