package Ch15;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 8/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx2 {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;

        byte[] result = null;

        try{
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);

            result = bos.toByteArray();

            String[] hex = new String[result.length];

            for(int i = 0; i < result.length; i++){
                if(result[i] < 0)
                    hex[i] = String.format("%02x", result[i] + 256);
                else
                    hex[i] = String.format("%02x", result[i]);
            }
            System.out.println("Decimal      : " + Arrays.toString(result));
            System.out.println("Hexadecimal  : " + Arrays.toString(hex));

            dos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
