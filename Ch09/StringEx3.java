package Ch09;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 6/7/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];              //char[] cArr = {};
        String s = new String(cArr);            //String s = new String("");

        System.out.println(Arrays.toString(cArr));
        System.out.println(s);
        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");


    }
}
