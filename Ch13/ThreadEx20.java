package Ch13;

/**
 * Created by Sang Jun Park on 7/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx20 {
    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;

        for(int i = 0; i < 20; i++){
            requiredMemory = (int)(Math.random() * 10) * 20;

            //
            //
            if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4){
                gc.interrupt();
                try{
                    gc.join(100);
                }catch (InterruptedException e){}
            }
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory : " + gc.usedMemory);
        }

    }
}
class ThreadEx20_1 extends Thread{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    public void run(){
        while(true){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Awaken by interrupt().");
            }

            garbageCollector();
            System.out.println("Garbage Collected. Free Memory : " + freeMemory());
        }
    }
    public void garbageCollector(){
        usedMemory -= 300;
        if(usedMemory < 0)
            usedMemory = 0;
    }
    public int totalMemory(){
        return MAX_MEMORY;
    }
    public int freeMemory(){
        return MAX_MEMORY - usedMemory;
    }
}
