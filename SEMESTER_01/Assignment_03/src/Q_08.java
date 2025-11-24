import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        double unit = s.nextDouble();
        double totalbill;

        if(unit==50) {
            totalbill = 50 * 3.00;
        }
        else if(unit<=200) {
            totalbill = (50 * 3.00) + ((unit - 50)*4.80);
        }
        else if(unit<=400) {
            totalbill =  (50 * 3.00) + (150*4.80) + (unit - 200)*5.80;
        }
        else {
            totalbill = (50 * 3.00) + (150*4.80) + (200*5.80) + (unit - 400)*6.20;
        }

        System.out.println("Do you want to pay your bill online? (Y/N) : ");
        char onlinepayment = s.next().charAt(0);
       // s.nextLine();
       // String onlinepayment = s.nextLine();
        double discount = totalbill*0.03;
        //if (onlinepayment.equalsIgnoreCase("Y")) {
        if(onlinepayment=='Y') {
            System.out.println("You received a 3% online payment discount of Rs. " +discount );
            double amountpayable = totalbill-discount;
            System.out.println("Amount payable: " +amountpayable);
        }
         // else if (onlinepayment.equalsIgnoreCase("N")) {
         else if (onlinepayment=='N') {
            System.out.println("Total Electricity Bill: " +totalbill);
            System.out.println("Amount payable: " +totalbill);
        }
    }
}
