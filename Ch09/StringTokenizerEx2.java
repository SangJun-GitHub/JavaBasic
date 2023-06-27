package Ch09;

import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 6/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()",true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
