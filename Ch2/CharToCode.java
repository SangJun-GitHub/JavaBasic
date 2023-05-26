package Ch2;

/**
 * Created by Sang Jun Park on 2/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int chCode = (int)ch;

        System.out.printf("%c=%d(%#X)\n", ch, chCode, chCode);
    }
}
