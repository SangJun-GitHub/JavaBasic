package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 7, 31);          //2005-08-31

        System.out.println(toString(date));
        System.out.println("-- 1 day after --");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("-- 6 months before --");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("-- 31 days after(roll) --");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("-- 31 days after(add) --");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + " year " + (date.get(Calendar.MONTH) + 1) + " month " + date.get(Calendar.DATE) + " day";
    }
}
