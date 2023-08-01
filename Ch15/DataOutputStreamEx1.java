package Ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try{
            fos = new FileOutputStream("src\\main\\resources\\sample.dat");
            dos = new DataOutputStream(fos);

            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            dos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
