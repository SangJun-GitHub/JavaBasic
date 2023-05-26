package Ch2;

/**
 * Created by Sang Jun Park on 3/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CastingEx4 {
    public static void main(String[] args) {
        int     i   = 91234567;
        float   f   = (float) i;
        int     i2  = (int) f;

        double  d   = (double) i;
        int     i3  = (int)d;

        float   f2  = 1.666f;
        int     i4  = (int) f2;

        System.out.printf("i=%d\n",i);              //91234567
        System.out.printf("f=%f i2=%d\n", f, i2);   //9.1234568 91234568
        System.out.printf("d=%f i3=%d\n", d, i3);   //9.1234567 91234567
        System.out.printf("(int)%f=%d\n", f2, i4);  //1.666000 1
    }
}
