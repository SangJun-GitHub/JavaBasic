package Ch11.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sang Jun Park on 6/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();


        List list = new ArrayList(length/LIMIT + 10);   //14

        for(int i = 0; i < length; i += LIMIT){
            if(i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }

        for(Object a : list){
            System.out.println(a);
        }
    }
}
