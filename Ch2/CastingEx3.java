package Ch2;

/**
 * Created by Sang Jun Park on 3/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CastingEx3 {
    public static void main(String[] args) {
        float f     = 9.1234567f;
        double d    = 9.1234567;
        double d2   = (double) f;

        System.out.printf("f  =%20.18f\n", f);  //9.123456954956055000
        System.out.printf("d  =%20.18f\n", d);  //9.123456700000000000
        System.out.printf("d2 =%20.18f\n", d2); //9.123456954956055000

    }
}
