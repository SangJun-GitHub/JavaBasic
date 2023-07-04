package Ch13;

import Ch07.InterfaceTest;

/**
 * Created by Sang Jun Park on 7/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx12 {
    public static void main(String[] args){
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();
        th1.start();
        th2.start();

        try{
            th1.sleep(2000);
        }catch(InterruptedException e){

        }
        System.out.println("<< main exit >>");
    }
}
class ThreadEx12_1 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++){
            System.out.print("-");
        }
        System.out.println("<< th1 exit >>");
    }
}
class ThreadEx12_2 extends Thread{
    public void run(){
        for(int i = 0; i < 300; i++){
            System.out.print("|");
        }
        System.out.println("<< th2 exit >>");
    }
}
