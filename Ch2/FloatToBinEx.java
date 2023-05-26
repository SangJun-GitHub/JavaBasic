package Ch2;

/**
 * Created by Sang Jun Park on 2/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;

        int i = Float.floatToIntBits(f);

        System.out.printf("%f\n", f);
        System.out.printf("%X\n", i);
    }
}
