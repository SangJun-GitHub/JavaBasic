package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("Enter a score.>");
        score = new Scanner(System.in).nextInt();

        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else
            grade = 'D';

        System.out.printf("Your grade is %s", grade);
    }
}
