package Ch9;

import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 6/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");


        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
