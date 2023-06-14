package Ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Jun Park on 6/13/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try{
            Date d = df1.parse("2015-11-23");
            System.out.println(df2.format(d));
        }catch (Exception e){}
    }
}
