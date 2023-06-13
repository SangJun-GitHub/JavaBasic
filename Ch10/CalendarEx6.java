package Ch10;

import java.util.Calendar;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx6 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage :  java CalendarEx6 2015 11");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year,month-1, 1);          //2004-11-1
        eDay.set(year, month, 1);                  //2004-12-1

        eDay.add(Calendar.DATE, -1);            //2004-11-30

        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);


        System.out.println("       " + args[0] + " - " + args[1] + "   " );
        System.out.println(" SU MO TO WE TH FR SA");

        for(int i = 1; i < START_DAY_OF_WEEK; i++){
            System.out.print(" ");

        }
        for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++){
            System.out.print((i < 10)? "  " + i : " " + i);
            if(n%7==0)
                System.out.println();
        }
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + " year " + (date.get(Calendar.MONTH) + 1) + " month " + date.get(Calendar.DATE) + " day";
    }

}
