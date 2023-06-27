package Ch09;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src\\main\\resources\\data.txt"));

        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()){
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (sum)/cnt);
    }
}
