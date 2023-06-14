package Ch10;

import java.text.MessageFormat;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday : {3}";

        Object[] arguments = {"java","123-456-789","23","06-14"};

        String result = MessageFormat.format(msg, arguments);

        System.out.println(result);
    }
}
