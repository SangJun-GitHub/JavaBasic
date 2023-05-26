package Ch5;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx14 {
    public static void main(String[] args) {
        String str = "ABCDE";

        for(int i = 0; i < str.length(); i++)
            System.out.println("str.charAt("+i+"): " + str.charAt(i));

        char[] chArr = str.toCharArray();

        System.out.println(chArr);
    }
}
