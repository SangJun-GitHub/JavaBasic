package Ch03;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        int d = (int)a * b;
        System.out.println(c);      //44        Overflow lost 24 bits
        System.out.println(d);      //300
    }
}
