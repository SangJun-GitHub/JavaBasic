package Ch3;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/15/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';

        System.out.printf("Enter a character >");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("You entered a number.\n");
        }else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <='Z') ){
            System.out.printf("You entered an alphabet.\n");
        }else{
            System.out.printf("You entered not a number or an alphabet.\n");
        }
    }
}
