package Ch13;

/**
 * Created by Sang Jun Park on 6/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */

//Multi Thread
public class ThreadEx5 {
    static long startTime;

    public static void main(String[] args) {
        ThreadEx5_1 t1 = new ThreadEx5_1();
        t1.start();
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("Time required 1 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("Time required 2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
