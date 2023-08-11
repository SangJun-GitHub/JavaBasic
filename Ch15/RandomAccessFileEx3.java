package Ch15;


import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * Created by Sang Jun Park on 8/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class RandomAccessFileEx3 {
    public static void main(String[] args) {
        int sum = 0;

        try{
            RandomAccessFile raf = new RandomAccessFile("src\\main\\resources\\score2.dat", "r");
            int i = 4;

            while(true){
                raf.seek(i);
                sum += raf.readInt();
                i += 16;
            }
        }catch (EOFException e){
            System.out.println("Sum of English score : " + sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
