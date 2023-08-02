package Ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum     = 0;
        int score   = 0;

        try(FileInputStream fis = new FileInputStream("src\\main\\resources\\score.dat");
            DataInputStream dis = new DataInputStream(fis)){

            while(true){
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        }catch (EOFException e){
            System.out.println("The total of scores : " + sum);
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
