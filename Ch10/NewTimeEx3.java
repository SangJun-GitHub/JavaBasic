package Ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class DayAfterTomorrow implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal){
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}
public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        System.out.println(today);
        System.out.println(date);
        System.out.println(today.with(firstDayOfNextMonth()));
        System.out.println(today.with(firstDayOfMonth()));
        System.out.println(today.with(lastDayOfMonth()));
        System.out.println(today.with(firstInMonth(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(lastInMonth(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(previous(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(previousOrSame(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(next(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(nextOrSame(DayOfWeek.WEDNESDAY)));
        System.out.println(today.with(dayOfWeekInMonth(4, DayOfWeek.WEDNESDAY)));
    }
}
