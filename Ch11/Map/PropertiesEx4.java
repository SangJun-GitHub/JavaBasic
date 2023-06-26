package Ch11.Map;

import java.util.Properties;

/**
 * Created by Sang Jun Park on 6/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();

        System.out.println("java.version    : " + sysProp.getProperty("java.version"));
        System.out.println("user.language   : " + sysProp.getProperty("user.language"));

        sysProp.list(System.out);
    }
}
