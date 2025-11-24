
public class Q10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Random values: ");
        Double a = Math.random();
        System.out.println(a);
        Double b = Math.random();
        System.out.println(b);
        Double c = Math.random();
        System.out.println(c);
        Double d = Math.random();
        System.out.println(d);
        Double e = Math.random();
        System.out.println(e);

        double avg = (a+b+c+d+e)/5;
        double min = Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
        double max = Math.max(a,Math.max(b,Math.max(c,Math.max(d,e))));

        System.out.println("Average Value: " + avg);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }
}