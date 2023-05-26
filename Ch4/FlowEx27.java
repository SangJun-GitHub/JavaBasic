package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx27 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        boolean flag = true;

        System.out.println("Enter numbers for sum.(for exit enter 0)");

        while (flag){
            System.out.print(">>");
            num = new Scanner(System.in).nextInt();

            if(num != 0)
                sum += num;
            else
                flag = false;
        }

        System.out.println("The total is " + sum);
    }
}
