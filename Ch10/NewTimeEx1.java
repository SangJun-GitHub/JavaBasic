package Ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1989,8,30);
        LocalTime birthTime = LocalTime.of(11,18,59);

        System.out.println("today=" + today);
        System.out.println("now=" + now);
        System.out.println("birthDate=" + birthDate);
        System.out.println("birthTime=" + birthTime);

        System.out.println(birthDate.withYear(2000));                               //2000-8-30
        System.out.println(birthDate.plusDays(1));                         //2000-8-31
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));         //2000-8-31

        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));                //11:00:00

        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());                  //1-24
        System.out.println(ChronoField.HOUR_OF_DAY.range());                        //0-23
    }
}
