package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        System.out.print("Enter a number ex)1235 .>");
        num = new Scanner(System.in).nextInt();

        while (num != 0){
            sum += num % 10;
            System.out.printf("sum = %2d, num = %d\n",sum, num);
            num /= 10;
        }
    }
}
