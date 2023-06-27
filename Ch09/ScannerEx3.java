package Ch09;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ScannerEx3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src\\main\\resources\\data2.txt"));

        int cnt = 0;
        int totalSum = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");

            int sum = 0;

            while(sc2.hasNextInt()){
                sum += sc2.nextInt();
            }

            System.out.println(line + " , sum = " + sum);
            totalSum += sum;
            cnt++;

        }
        System.out.println("Line: " + cnt + ", Total : " + totalSum);
    }
}
