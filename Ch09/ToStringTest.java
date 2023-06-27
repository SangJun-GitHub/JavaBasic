package Ch09;

import java.util.Date;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("CANADA");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());

        //String class, Date class already override toString()
    }
}
