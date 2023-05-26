package Ch2;

/**
 * Created by Sang Jun Park on 2/27/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FloatEx1 {
    public static void main(String[] args) {
        float f     = 9.12345678901234567890f;
        float f2    = 1.2345678901234567890f;
        double d    = 9.12345678901234567890;

        System.out.printf("        .123456789012345678901234\n");
        System.out.printf("f    : %-24f\n", f);
        System.out.printf("f    : %24.24f\n", f);
        System.out.printf("f2   : %24.24f\n", f2);
        System.out.printf("d    : %24.24f\n", d);
    }
}
