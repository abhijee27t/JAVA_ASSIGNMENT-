
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		boolean d = (a<b && b<c || a>b && b>c);
		System.out.println("Strict order check " +a+ " " +b+ " "+c+ "--->"+d);
		float a1 = Float.parseFloat(args[3]);
		float b1 = Float.parseFloat(args[4]);
		float c1 = Float.parseFloat(args[5]);
		boolean d1 = (a1<b1 && b1<c1 || a1>b1 && b1>c1);
		System.out.println("Strict order check " +a1+ " " +b1+ " "+c1+ "--->"+d1);
		float a2 = Float.parseFloat(args[6]);
		float b2 = Float.parseFloat(args[7]);
		float c2 = Float.parseFloat(args[8]);
		boolean d2 = (a2<b2 && b2<c2 || a2>b2 && b2>c2);
		System.out.println("Strict order check " +a2+ " " +b2+ " "+c2+ "--->"+d2);
		

	}

}
