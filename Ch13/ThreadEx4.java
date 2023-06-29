package Ch13;

/**
 * Created by Sang Jun Park on 6/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */

//Single Thread
public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("Time required 1 : " + (System.currentTimeMillis() - startTime));

        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("Time required 2 : " + (System.currentTimeMillis() - startTime));

    }
}
