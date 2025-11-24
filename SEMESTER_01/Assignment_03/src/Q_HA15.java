import java.util.Scanner;

public class Q_HA15 {                                                    // 0--> Scissor, 1--> Rock, 2--> Paper
    public static void main(String[] args) {
        int CS = (int) (Math.random()*2)+0;
        System.out.println(" scissor (0), rock (1), paper (2) :" );
        Scanner sc = new Scanner(System.in);
        int You = sc.nextInt();
        if(CS==0 && You==1) {
            System.out.println("The computer is scissor. You are Rock. You won ");
        }
        else if(CS==1 && You==0) {
            System.out.println("The computer is Rock. You are Scissor . Computer won" );
        }
        else if(CS==2 && You==0) {
            System.out.println("The computer is paper. You are scissor. You won" );
        }
        else if(CS==0 && You==2) {
            System.out.println("The computer is scissor . You are  paper. Computer won" );
        }
        else if(CS==1 && You==2) {
            System.out.println("The computer is Rock. You are paper  . Computer won ");
        }
        else if(CS==2 && You==1) {
            System.out.println("The computer is paper. You are rock. You won" );
        }
        else if (CS==0 && You==0) {
            System.out.println("The computer is scissor. You are scissor . It is a draw" );
        }
        else if (CS==1 && You==1) {
            System.out.println("The computer is rock. You are rock . It is a draw" );
        }
        else if (CS==2 && You==2) {
            System.out.println("The computer is paper. You are paper . It is a draw" );
        }


    }
}
















