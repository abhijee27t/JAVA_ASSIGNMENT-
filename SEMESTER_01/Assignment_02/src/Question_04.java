import java.util.Scanner;

public class
Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the hexagon = ");
		double s = sc.nextDouble();
		double a = 3*Math.sqrt(3)/2*Math.pow(s,2);
		System.out.println("The Area of the hexagon is " +a);
		sc.close();

	}

}
