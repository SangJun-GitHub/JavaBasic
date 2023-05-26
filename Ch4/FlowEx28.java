package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int min = 1;
        int max = 100;
        int answer = (int)(Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.printf("Enter a number between %d to %d. >", min, max);
            input = sc.nextInt();
            if(input > answer){
                System.out.println("Try smaller number");
                max = input;
            } else if (input < answer) {
                System.out.println("Try bigger number");
                min = input;
            }
        }while(input != answer);

        System.out.println("You are correct the answer is "+ answer);


    }
}
