package Ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 8/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class SerialEx2 {
    public static void main(String[] args) {
        try{
            String fileName = "src\\main\\resources\\UserInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            ObjectInputStream in = new ObjectInputStream(bis);

            //Must match input oder with output oder
            UserInfo u1 = (UserInfo) in.readObject();
            UserInfo u2 = (UserInfo) in.readObject();
            ArrayList<UserInfo> list = (ArrayList<UserInfo>) in.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
