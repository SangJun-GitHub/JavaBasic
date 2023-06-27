package Ch09;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true){
            String prompt = ">>";
            System.out.print(prompt);

            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +");

            String command = argArr[0].trim();
            if("".equals(command))
                continue;;

            command = command.toLowerCase();


            if(command.equals("q"))
                System.exit(0);
            else {
                for(int i = 0; i < argArr.length; i++)
                    System.out.println(argArr[i]);
            }
        }
    }
}
