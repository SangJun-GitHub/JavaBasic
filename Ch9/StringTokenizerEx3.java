package Ch9;

import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 6/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx3 {
    public static void main(String[] args) {
        String source = "1,Sang,100,100,100|2,Jun,95,80,90|3,Park,80,90,90";

        StringTokenizer st = new StringTokenizer(source, "|");

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(token, ",");

            while(st2.hasMoreTokens()){
                System.out.println(st2.nextToken());
            }
            System.out.println("-----");
        }
    }
}
