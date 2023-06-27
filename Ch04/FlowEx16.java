package Ch04;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx16 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = 0 ; i < 5; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("Enter a number for stars.>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
