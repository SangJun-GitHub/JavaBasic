package Ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/13/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("Enter a date with this " + pattern + " pattern. ex)2015/12/31");
        while(s.hasNextLine()){
            try{
                inDate = df.parse(s.nextLine());
                break;
            }catch(Exception e){}
            System.out.println("Enter a date with this " + pattern + " pattern. ex)2015/12/31");
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = Math.abs((cal.getTimeInMillis()) - today.getTimeInMillis()) / (60*60*1000);
        System.out.println("The difference between entered date and toady is " + day + " hours difference");
    }
}
