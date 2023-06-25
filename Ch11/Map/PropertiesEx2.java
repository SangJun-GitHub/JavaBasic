package Ch11.Map;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sang Jun Park on 6/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE: java PropertiesEx2 INPUTFLLENAME");
            System.exit(0);
        }

        Properties prop = new Properties();

        String inputFile = "..\\..\\..\\resources\\input.txt";

        try{
            prop.load(new FileInputStream(inputFile));
        }catch (IOException e){
            System.out.println("Can not found the file");
            System.exit(0);
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");

        int max = 0;
        int min = 0;
        int sum = 0;

        for(int i = 0; i < data.length; i++){
            int intValue = Integer.parseInt(data[i]);

            if(i == 0)
                max = min = intValue;

            if(max < intValue)
                max = intValue;
            else if(min > intValue)
                min = intValue;

            sum += intValue;
        }

        System.out.println("Name    : " + name);
        System.out.println("Max     : " + max);
        System.out.println("Min     : " + min);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + (sum * 100.0/ data.length)/100.0);
    }
}
