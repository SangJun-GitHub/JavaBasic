package Ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 7/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//java FileCopy.java FileCopy.java FileCopy.bak
//cat FileCopy.bak
public class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream     fis = new FileInputStream(args[0]);
            FileOutputStream    fos = new FileOutputStream(args[1]);

            int data = 0;
            while((data = fis.read()) != -1){
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
