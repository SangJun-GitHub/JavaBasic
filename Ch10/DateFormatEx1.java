package Ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Jun Park on 6/13/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy 'year' MMM dd' day 'E");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        sdf5 = new SimpleDateFormat("'Today is 'D'th day in this year'");
        sdf6 = new SimpleDateFormat("'Today is 'd'th day in this month'");
        sdf7 = new SimpleDateFormat("'Today is 'w'th week in this year'");
        sdf8 = new SimpleDateFormat("'Today is 'W'th week in this month'");
        sdf9 = new SimpleDateFormat("'Today is 'F'th 'E' day of the week in this month'");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println();
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));


    }
}
