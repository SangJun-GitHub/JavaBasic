package Ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Sang Jun Park on 8/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("src\\main\\resources\\text.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
