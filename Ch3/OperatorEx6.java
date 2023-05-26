package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);     //byte c = a + b;   error!

        System.out.println(c);
    }
}
