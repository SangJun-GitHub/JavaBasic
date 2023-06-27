package Ch05;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < words.length; i++){
            System.out.printf("Q%d Translate this word(%s) to Korean.>", i , words[i][0]);

            String tmp = sc.nextLine();

            if(words[i][1].equals(tmp))
                System.out.println("Correct");
            else
                System.out.printf("Wrong. The correct answer is %s\n", words[i][1]);
        }
    }
}
