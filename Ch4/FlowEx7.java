package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx7 {
    public static void main(String[] args) {
        System.out.printf("Enter a number in Rock(1) Paper(2) Scissors(3).>");

        int user = new Scanner(System.in).nextInt();
        int com = (int)(Math.random() * 3) + 1;

        System.out.printf("You are %d\n", user);
        System.out.printf("com is %d\n", com);

        switch (user - com){
            case 2: case -1:
                System.out.println("You lose");
                break;
            case 1: case -2:
                System.out.println("You win");
                break;
            case 0:
                System.out.println("Draw");
        }
    }
}
