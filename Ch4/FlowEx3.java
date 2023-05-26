package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx3 {
    public static void main(String[] args) {
        System.out.println("Enter a number.>");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 0){
            System.out.println("The number is 0");
        }else{
            System.out.println("The number is not 0");
        }
    }
}
