package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        other:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("choose one of the menu(1~3). (exit:0).>");

            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("End program");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("You choose wrong menu");
                continue;
            }


            for (; ; ) {
                System.out.print("Enter a number for calculate. (calculate exit : 0, program exit : 99)");
                num = sc.nextInt();

                if (num == 0)
                    break;

                if (num == 99)
                    break other;

                switch(menu){
                    case 1:
                        System.out.println("result = " + num*num);
                        break ;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break ;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break ;
                }
            }
        }

    }
}
