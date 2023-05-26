package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;      //1000000
        int b = 2_000_000;      //2000000
        long c = a * b;
        long d = (long)a * b;
        System.out.println(c);  //-1454759936   Overflow(int * int)
        System.out.println(d);  //2000000000000
    }
}
