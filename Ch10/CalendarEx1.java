package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println("year                    : " + today.get(Calendar.YEAR));
        System.out.println("Month                   : " + today.get(Calendar.MONTH));
        System.out.println("Week of Year            : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month           : " + today.get(Calendar.WEEK_OF_MONTH));

        System.out.println();
        System.out.println("Date                    : " + today.get(Calendar.DATE));
        System.out.println("Day of Month            : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Year             : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of Week             : " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of week in Month    : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println();
        System.out.println("AM PM                   : " + today.get(Calendar.AM_PM));
        System.out.println("Hour                    : " + today.get(Calendar.HOUR));
        System.out.println("Hour of Day             : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute                  : " + today.get(Calendar.MINUTE));
        System.out.println("Second                  : " + today.get(Calendar.SECOND));
        System.out.println("Millisecond             : " + today.get(Calendar.MILLISECOND));
        System.out.println("Zone offset             : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("Last day of this month  : " + today.getActualMaximum(Calendar.DATE));


    }
}
