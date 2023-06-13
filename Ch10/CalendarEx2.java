package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "Mon", "Tue","Wed","Thu","Fri","Sat","Sun"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2020, 7, 15);
        System.out.println("Date1 : " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("Today : " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;   //  1/1000 second

        System.out.println("From date1 to Today, passed " + diff + " seconds");
        System.out.println("to day : " + diff/(24*60*60) + " days");            //  1day = 24*60*60

    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + " year " + date.get(Calendar.MONTH + 1) + " month " + date.get(Calendar.DATE) + " day, ";
    }
}
