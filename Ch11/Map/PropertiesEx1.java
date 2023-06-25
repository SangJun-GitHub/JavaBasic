package Ch11.Map;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by Sang Jun Park on 6/24/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "en");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()){
            String element = (String)e.nextElement();
            System.out.println(element + " = " + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20");
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));

        System.out.println();
        System.out.println(prop);

        System.out.println();
        prop.list(System.out);


    }
}
