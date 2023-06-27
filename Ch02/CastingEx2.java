package Ch02;

/**
 * Created by Sang Jun Park on 3/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);    //10 10

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);    //300 44

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);    //10 10

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);    //-2 -2
                                                                    //00000000000000000000000000000001 = 2
        System.out.println("i=" + Integer.toBinaryString(i));       //11111111111111111111111111111110

    }
}
