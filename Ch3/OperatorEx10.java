package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1_000_000;

        int result1 = a * a / a;    //1_000_000 * 1_000_000 / 1_000_000
        int result2 = a / a * a;    //1_000_000 / 1_000_000 * 1_000_000

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);   //-727      (a * a)Overflow
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);   //1_000_000
    }
}
