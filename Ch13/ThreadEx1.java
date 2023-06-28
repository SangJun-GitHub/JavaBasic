package Ch13;

/**
 * Created by Sang Jun Park on 6/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);
        //Thread t2 = new Thread(new ThreadEx1_2());

        t1.start();
        t2.start();
    }
}
class ThreadEx1_1 extends Thread{
    public void run(){
        System.out.println("ThreadEx1_1");
        for(int i = 0; i < 5; i++)
            System.out.println(getName());       //Call getName() of parent Thread
    }
}
class ThreadEx1_2 implements Runnable{
    @Override
    public void run(){
        System.out.println("ThreadEx1_2");
        for(int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName());
    }
}
