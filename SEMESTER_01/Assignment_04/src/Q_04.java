import java.util.*;
public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*10)+1;
        System.out.println("Guess the number between 1 and 10!");
        int userguess;
        do{
            System.out.println("Enter your Guess: ");
            userguess = sc.nextInt();

            if(userguess>random){
                System.out.println("\"Too High ,try again\"");
            }else if (userguess<random){
                System.out.println("\"Too Low, try again!\"");
            }else{
                System.out.println("\"Good guess!\"");
            }
        }while(userguess!=random);


    }
}
