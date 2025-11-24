import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and the length of the cylinder: ");
		double r = sc.nextDouble();
		double l = sc.nextDouble();
		System.out.println("The Area is " +Math.PI*r*r);
		System.out.println("The Volume of the Cylinder is " +Math.PI*r*r*l);
		sc.close();
	}
}
