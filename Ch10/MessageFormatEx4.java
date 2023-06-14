package Ch10;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "src\\main\\resources\\data3.txt";
        String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";

        Scanner s = new Scanner(new File(fileName));
        String pattern = "{0},{1},{2},{3}";
        MessageFormat mf = new MessageFormat(pattern);

        while(s.hasNextLine()){
            String line = s.nextLine();
            Object[] obj = mf.parse(line);
            System.out.println(MessageFormat.format(msg, obj));
        }
        s.close();
    }
}
