package Ch09;

import java.util.StringTokenizer;

/**
 * Created by Sang Jun Park on 6/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + "|");

        System.out.println("split:" + result.length);

        int i = 0;
        for(; st.hasMoreTokens(); i++)
            System.out.print(st.nextToken() + "|");

        System.out.println("split:" + i);
    }
}
