package Ch6;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1 channel is "+ t1.channel);
        System.out.println("t2 channel is "+ t2.channel);

        t1.channel = 7;
        System.out.println("t1 channel is "+ t1.channel);
        System.out.println("t2 channel is "+ t2.channel);
    }
}
