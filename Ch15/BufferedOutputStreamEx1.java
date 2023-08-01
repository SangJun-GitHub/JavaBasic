package Ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("src\\main\\resources\\123.txt");

            //Buffer size 5
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i = '1'; i <= '9'; i++)
                bos.write(i);

            //bos.close();                      //left 6789 in buffer
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
