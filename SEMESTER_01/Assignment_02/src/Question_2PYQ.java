import java.util.Scanner;

public class Question_2PYQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Km = ");
		double s = sc.nextDouble();
		System.out.println(s+" km is " + s*1000 + " meters ");
		System.out.println(s+ " km is " + s*3280.8399 + " feets ");
		System.out.println(s+ " km is " + s*39370.0787 + " inches ");
		System.out.println(s+ " km is " + s*100000 + " centimetres " );
		sc.close();
		
		
	}

}
