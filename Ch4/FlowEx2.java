package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print("Enter a number.>");

        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0){
            System.out.println("The number is 0");
        }
        if(input != 0)
            System.out.println("The number is not 0");
            System.out.printf("The number is %d", input);   //This sentence is out of if statement
    }
}
