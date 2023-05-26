package Ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sang Jun Park on 5/16/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("Today is " + date.format(today));
        System.out.println("Time is " + time.format(today));
    }
}
