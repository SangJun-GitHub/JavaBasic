package Ch11.Map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sang Jun Park on 6/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "en");
        prop.setProperty("size", "10");
        prop.setProperty("capacity","10");

        try{
            prop.store(new FileOutputStream(".\\src\\main\\resources\\output.txt"),"Properties Example");
            prop.storeToXML(new FileOutputStream(".\\src\\main\\resources\\output.xml"), "Properties Example");
        }catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
