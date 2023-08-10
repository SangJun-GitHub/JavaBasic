package Ch15;

import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StandardIOEx1 {
    public static void main(String[] args) {
        try{
            int input = 0;

            while((input = System.in.read()) != -1){
                System.out.println("input : " + input + ", (char)input : " + (char)input );
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
