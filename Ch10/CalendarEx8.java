package Ch10;

/**
 * Created by Sang Jun Park on 6/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "201508";
        String date2 = "201405";

        int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + Integer.parseInt(date2.substring(4));

        System.out.println("Difference between " + date1 + " and " + date2 + " : " + Math.abs(month1 - month2) + " months");
    }
}
