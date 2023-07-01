package Ch13;

/**
 * Created by Sang Jun Park on 6/29/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx10 implements Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true);                      //Without daemon thread this, application will be working forever
        t.start();

        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}

            System.out.println(i);
            if(i == 5)
                autoSave = true;
        }
        System.out.println("Exit program");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3 * 1000);
            }catch (Exception e){}

            if(autoSave)
                autoSave();
        }
    }
    public void autoSave(){
        System.out.println("Working Tasks is saved");
    }
}
