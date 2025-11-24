import java.util.*;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        if(marks<0 || marks>100) {
            System.out.println("Invalid marks! Please enter marks between 0 and 100. ");
        }
        else {
            char grade;
            switch(marks/10) {
                case 10:
                case 9:
                    grade = 'O';
                    break;
                case 8:
                    grade = 'A';
                    break;
                case 7:
                    grade = 'B';
                    break;
                case 6:
                    grade = 'C';
                    break;
                case 5:
                    grade = 'D';
                    break;
                case 4:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
                    break;
            }
            System.out.println("Grade:" +grade);
        }

    }
}
