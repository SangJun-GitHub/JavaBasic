package Ch15;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 7/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */

//java FileViewer.java FileViewer.java
public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int data = 0;

        while((data = fis.read()) != -1){
            char c = (char) data;
            System.out.print(c);
        }
    }
}
