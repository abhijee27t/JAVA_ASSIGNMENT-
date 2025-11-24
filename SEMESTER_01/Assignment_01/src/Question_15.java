
public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" (a) with using variable D ");
		int W = 10;
		int G = 20;
		int K = 30;
		int A = 40;
		System.out.println("Before swapping W = " +W+ " G = " +G+ " K = " +K+ " A = " + A );
		int D = G;
		G = K;
		K = A;
		A = W;
		W = D;
		System.out.println("After swapping W = " +W+ " G = " +G+ " K = " +K+ " A = " + A );
		
		
		System.out.println(" (b) Without using variable ");
		int w = 10;
		int g = 20;
		int k = 30;
		int a = 40;
		System.out.println("Before swapping w = " +w+ " g = " +g+ " k = " +k+ " a = " + a );
	    w = w+a+k+g;
	    a = w-a-k-g;
	    k = w-a-k-g;
	    g = w-a-k-g;
	    w = w-a-k-g;
		System.out.println("After swapping w = " +w+ " a = " +a+ " k = " +k+ " g = " +g );
	    
	    
		
		

	}

}
