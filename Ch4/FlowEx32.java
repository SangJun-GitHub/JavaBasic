package Ch4;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 3/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("choose one of the menu(1~3). (exit:0).>");

            menu = sc.nextInt();

            if(menu==0){
                System.out.println("End program");
                break;
            }else if(!(1 <= menu && menu <= 3)){
                System.out.println("You choose wrong menu");
                continue;
            }
            System.out.println("You choose " + menu + " menu. ");
        }

    }
}
