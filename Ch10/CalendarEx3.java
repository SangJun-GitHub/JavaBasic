package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600,60,1};
        final String[] TIME_UNIT_NAME = {"Hour", "Minute", "Second"};


        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : " + toString(time1));
        System.out.println("time2 : " + toString(time2));

        long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.println("Difference between time1 and time2 : " + diff + " seconds");

        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++){
            tmp += diff/TIME_UNIT[i] +" " + TIME_UNIT_NAME[i] + " ";
            diff %= TIME_UNIT[i];
        }
        System.out.println(tmp);

    }

    public static String toString(Calendar date){
        return date.get(Calendar.HOUR_OF_DAY) + " hour " + date.get(Calendar.MINUTE) + " minute " + date.get(Calendar.SECOND) + " second";
    }
}
