package Ch10;

import java.text.DecimalFormat;

/**
 * Created by Sang Jun Park on 6/13/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try{
            Number num = df1.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");
            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));
        }catch(Exception e){

        }
    }
}
