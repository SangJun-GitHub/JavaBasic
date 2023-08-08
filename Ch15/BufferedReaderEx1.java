package Ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src\\main\\java\\Ch15\\BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for(int i = 1; (line = br.readLine()) != null; i++){
                if(line.indexOf(";") != -1)
                    System.out.println(i + " : " + line);
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
