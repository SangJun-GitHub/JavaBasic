package Ch04;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx5 {

    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("Enter a score.>");
        score = new Scanner(System.in).nextInt();

        if(score >= 90){
            grade = 'A';
            if(score >= 98)
                opt = '+';
            else if(score < 94)
                opt = '-';
        }else if(score >= 80){
            grade = 'B';
            if(score >= 88)
                opt = '+';
            else if(score < 84)
                opt = '-';
        }else if(score >= 70){
            grade = 'C';
            if(score >= 78)
                opt = '+';
            else if(score < 74)
                opt = '-';
        }else{
            grade = 'D';
        }

        System.out.printf("Your grade is %s%s", grade, opt);


    }
}
