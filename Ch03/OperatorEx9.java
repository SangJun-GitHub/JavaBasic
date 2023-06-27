package Ch03;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println(a);      //-727379968        (int * int)Overflow
        System.out.println(b);      //1000000000000     (int * long)
    }
}
