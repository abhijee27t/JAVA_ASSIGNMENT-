public class Q8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean res = (a <= (short) b*c) || (b <= (short) a*c) ||  (c <= (short) b*a);
        System.out.println("Product Check " +a+ " " +b+ " " +c+ "--->" +res);
        int a1 = Integer.parseInt(args[3]);
        int b1 = Integer.parseInt(args[4]);
        int c1 = Integer.parseInt(args[5]);
        boolean res1 = (a1 <= (short) b1*c1) || (b1 <= (short) a1*c1) ||  (c1 <= (short) b1*a1);
        System.out.println("Product Check " +a1+ " " +b1+ " " +c1+ "--->" +res1);
        int a2 = Integer.parseInt(args[6]);
        int b2 = Integer.parseInt(args[7]);
        int c2 = Integer.parseInt(args[8]);
        boolean res2 = (a2 <= (short) b2*c2) || (b2 <= (short) a2*c2) ||  (c2 <= (short) b2*a2);
        System.out.println("Product Check " +a2+ " " +b2+ " " +c2+ "--->" +res2);

    }
}
