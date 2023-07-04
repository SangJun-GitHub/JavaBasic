package Ch13;

import javax.swing.*;

/**
 * Created by Sang Jun Park on 7/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx13 {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th1 = new ThreadEx13_1();

        th1.start();

        String input = JOptionPane.showInputDialog("Enter any value.");
        System.out.println("You entered " + input + ".");
        th1.interrupt();
        System.out.println("isInterrupted() : " + th1.isInterrupted());
    }
}
class ThreadEx13_1 extends Thread{
    public void run(){
        int i = 10;

        while(i != 0 && !isInterrupted()){
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++);
        }
        System.out.println("Finished count down.");
    }
}
