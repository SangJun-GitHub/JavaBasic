package Ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum     = 0;
        int score   = 0;

        FileInputStream fis = null;
        DataInputStream dis = null;

        try{
            fis = new FileInputStream("src\\main\\resources\\score.dat");
            dis = new DataInputStream(fis);

            while(true){
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        }catch (EOFException e){
            System.out.println("The total of scores : " + sum);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(dis != null)
                    dis.close();
            }catch (IOException ie){
                ie.printStackTrace();
            }
        }
    }
}
