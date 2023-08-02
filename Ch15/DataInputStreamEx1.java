package Ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataInputStreamEx1 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src\\main\\resources\\sample.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            dis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
