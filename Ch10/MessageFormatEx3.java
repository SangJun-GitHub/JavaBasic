package Ch10;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx3 {
    public static void main(String[] args) throws ParseException {
        String[] data ={"INSERT INTO CUST_INFO VALUES ('java', '123-456-789', 27, '06-14');",
                        "INSERT INTO CUST_INFO VALUES ('JAVA', '987-654-321', 33, '06-15');"};

        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3})";
        MessageFormat mf = new MessageFormat(pattern);

        for(int i = 0; i < data.length; i++){
            Object[] objects = mf.parse(data[i]);
            for(int j = 0; j < objects.length; j++){
                System.out.print(objects[j] + ",");
            }
            System.out.println();
        }
    }
}
