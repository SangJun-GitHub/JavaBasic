package Ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
// java FileConversion.java FileConversion.java ../../resources/convert.txt
public class FileConversion {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);

            int data = 0;
            while((data = fr.read()) != -1){
                if(data != '\t' && data != '\n' && data != ' ' && data != '\r')
                    fw.write(data);
            }

            fr.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
