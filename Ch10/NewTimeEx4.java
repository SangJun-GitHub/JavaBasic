package Ch10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014,1,1);
        LocalDate date2 = LocalDate.of(2015,12,31);


        Period period = Period.between(date1 , date2);

        System.out.println("date1   = "+date1);
        System.out.println("date2   = "+date2);
        System.out.println("period  = "+period);
        System.out.println("Year    = "+period.getYears());
        System.out.println("Month   = "+period.get(ChronoUnit.MONTHS));
        System.out.println("Day     = "+period.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0,0,0);
        LocalTime time2 = LocalTime.of(12,34,56);

        Duration duration = Duration.between(time1, time2);
        System.out.println("time1   = "+time1);
        System.out.println("time2   = "+time2);
        System.out.println("duration= "+duration);

        LocalTime tmpTime = LocalTime.of(0,0,0).plusSeconds(duration.getSeconds());
        System.out.println("Hour    = "+tmpTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute  = "+tmpTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Second  = "+tmpTime.getSecond());
        System.out.println("Nano    = "+tmpTime.getNano());
    }
}
