import java.util.Scanner;
public class Question_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Enter x2 and y2 : ");
		double c = sc.nextDouble();
		double s = sc.nextDouble();
		double e = ((c - a)*(c - a)+(s - b)*(s - b));
		System.out.println("The distance between the two points is " +Math.sqrt(e));
		sc.close();
		
		

	}

}
