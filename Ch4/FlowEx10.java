package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("Enter a score.(1~100)>");
        score = new Scanner(System.in).nextInt();

        switch(score/10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.printf("Your grade is %s", grade);
    }
}
