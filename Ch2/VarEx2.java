package Ch2;

/**
 * Created by Sang Jun Park on 2/13/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x: " + x + " y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}
