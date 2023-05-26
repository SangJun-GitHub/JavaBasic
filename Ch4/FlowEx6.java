package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("Enter a number.>");

        int month = new Scanner(System.in).nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("Current season is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Current season is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Current season is autumn");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("Current season is winter");
        }
    }
}
