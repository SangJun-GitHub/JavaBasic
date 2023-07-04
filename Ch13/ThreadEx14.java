package Ch13;

import javax.swing.*;

/**
 * Created by Sang Jun Park on 7/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx14 {
    public static void main(String[] args) throws Exception{
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("Enter any value.");
        System.out.println("You entered " + input+ ".");
        th1.interrupt();
        System.out.println("Interrupted() : " + th1.isInterrupted());
    }
}
class ThreadEx14_1 extends Thread{
    public void run(){
        int i = 10;

        while(i != 0 && !isInterrupted()){
            System.out.println(i--);
            try{
                Thread.sleep(1000);                     //If interrupt occur by sleep(), InterruptedException will occur and interrupt will be initialized to false
            }catch (InterruptedException e){                  //To solve this problem, you will add interrupt() into catch statement to initialize to true
                //interrupt();
            }
        }
        System.out.println("Finished count down.");
    }
}
