package Ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx3 {
    public static void main(String[] args) {
        int[] score = {100,90,95,85,50};

        try{
            FileOutputStream fos = new FileOutputStream("src\\main\\resources\\score.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for(int i = 0; i < score.length; i++){
                dos.writeInt(score[i]);
            }

            dos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
