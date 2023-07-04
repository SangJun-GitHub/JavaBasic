package Ch13;

/**
 * Created by Sang Jun Park on 7/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx19 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();

        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try{
            th1.join();                             //main thread wait until th1 and th2 are finished
            th2.join();
        }catch(InterruptedException e){}

        System.out.println("Time required:" + (System.currentTimeMillis() - startTime));
    }
}
class ThreadEx19_1 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++)
            System.out.print(new String("-"));
    }
}
class ThreadEx19_2 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++){
            System.out.print(new String("|"));
        }
    }
}
