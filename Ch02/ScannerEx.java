package Ch02;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 2/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit.");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Your input is " + input);
        System.out.println("Your Number is " + num);

    }
}
