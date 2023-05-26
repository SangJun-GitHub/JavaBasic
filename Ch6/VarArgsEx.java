package Ch6;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"}));
        System.out.println("[" + concatenate(",",new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");

    }

    static String concatenate(String delim, String...args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }
        return result;
    }
/*    static String concatenate(String...args){
        return concatenate("", args);
    }*/                                             //Can not recognize method overloaded method
                                                    //When you use Variable arguments, Try avoiding overloading methods
}
