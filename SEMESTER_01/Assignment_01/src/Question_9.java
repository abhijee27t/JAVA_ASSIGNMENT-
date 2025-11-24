
public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" // (a) Using fourth variable d ");
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("Before swapping a = " +a+ " b = " +b+ " c = " +c);
		int d = a;
		a = b;
		b = c;
		c = d;
		System.out.println("After swapping a  = " +a+ " b = " +b+ " c = " +c); 
		
		System.out.println(" // (b) Without using fourth temporary variable.");
		int A = 10;
		int B = 20;
		int C = 30;
		System.out.println("Before swapping A = " +A+ " B = " +B+ " C = " +C);
		C = C + B + A;
		B = C - B - A;
		A = C - B - A;
		C = C - B - A;
		System.out.println("After swapping A  = " +A+ " B = " +B+ " C = " +C);     
		
		
	
	

	}

}
