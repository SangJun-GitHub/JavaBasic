package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015, 0, 31);      //2015-1-31
        System.out.println(toString(date));

        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + " year " + (date.get(Calendar.MONTH) + 1) + " month " + date.get(Calendar.DATE) + " day";
    }
}
