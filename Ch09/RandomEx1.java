package Ch09;

import java.util.Random;

/**
 * Created by Sang Jun Park on 6/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomEx1 {
    public static void main(String[] args) {
        Random rand  = new Random(1);
        Random rand2 = new Random(1);

        System.out.println(" = rand = ");
        for(int i = 0; i < 5; i ++)
            System.out.println(i + ":" + rand.nextInt());

        System.out.println();
        System.out.println(" = rand2 = ");
        for(int i = 0; i < 5; i ++)
            System.out.println(i + ":" + rand2.nextInt());
    }
}
