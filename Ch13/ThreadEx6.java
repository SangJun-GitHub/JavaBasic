package Ch13;

import javax.swing.*;

/**
 * Created by Sang Jun Park on 6/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */

//Single Thread
public class ThreadEx6 {
    public static void main(String[] args) throws Exception{
        String input = JOptionPane.showInputDialog("Enter any value.");
        System.out.println("Your entered value is " + input);

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
