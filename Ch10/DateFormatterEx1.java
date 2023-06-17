package Ch10;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sang Jun Park on 6/16/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String[] patternArr = {
                "yyyy=MM-dd HH:mm:ss",
                "''yy'year' MMM dd'day' E",
                "yyyy-MM,dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "'Today is' D'th day in this year'",
                "'Today is' d'th day in this month'",
                "'Today is' w'th week in this year'",
                "'Today is' w'th week in this month'"
        };

        for(int i = 0; i < patternArr.length; i++){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patternArr[i]);
            System.out.println(zonedDateTime.format(formatter));
        }
    }
}
