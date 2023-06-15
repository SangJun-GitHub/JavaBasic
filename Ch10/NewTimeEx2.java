package Ch10;

import java.time.*;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015,12,31);
        LocalTime time = LocalTime.of(12,34,56);

        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = ZonedDateTime.of(dt, zid);
        //String strZid = zdt.getZone().getId();

        ZonedDateTime torontoTime = ZonedDateTime.now();
        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.now().withZoneSameInstant(seoulId);

        //ZonedDateTime -> OffsetDateTime
        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(zid);
        System.out.println(zdt);
        System.out.println(torontoTime);
        System.out.println(seoulTime);
        System.out.println(odt);
    }
}
