package Ch10;

import java.text.MessageFormat;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";

        Object[][] arguments = {
                {"java", "123-456-789", "27", "06-14"},
                {"JAVA", "987-654-321", "23", "06-15"}
        };

        for(int i = 0 ; i < arguments.length; i++){
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
