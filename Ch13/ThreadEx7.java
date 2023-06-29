package Ch13;

import javax.swing.*;

/**
 * Created by Sang Jun Park on 6/29/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx7 {
    public static void main(String[] args) throws Exception {
        ThreadEx7_1 t1 = new ThreadEx7_1();
        t1.start();

        String input = JOptionPane.showInputDialog("Enter any value.");
        System.out.println("Your entered value is " + input);

    }
}
class ThreadEx7_1 extends Thread{
    public void run(){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
