import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic Salary: ");
		double b = sc.nextDouble();
		double c = 40.0/100*b;
		double h = 20.0/100*b;
		double G = b + c + h;
		System.out.println("DA is" +c);
		System.out.println("HRA is " +h);
		System.out.println("Gross Salary is " +(int)G);

	}

}
