package Ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Sang Jun Park on 8/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class NetworkEx5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-zip-file.zip";

        int ch = 0;

        try{
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("src/main/resources/sample-zip-file.zip");

            while((ch = in.read()) != -1){
                out.write(ch);
            }
            in.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
