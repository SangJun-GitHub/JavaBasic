package Ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 7/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class IOEx3 {
    public static void main(String[] args) {
        byte[] inSrc    = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc   = null;
        byte[] temp     = new byte[4];

        ByteArrayInputStream input      = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output    = new ByteArrayOutputStream();

        System.out.println("Input Source    : " + Arrays.toString(inSrc));

        try{
            while(input.available() > 0){
                input.read(temp);
                output.write(temp);
                //System.out.println("Temp            : " + Arrays.toString(temp));

                outSrc = output.toByteArray();
                printArrays(temp, outSrc);
            }
        }catch (Exception e){}
    }
    static void printArrays(byte[] temp, byte[] outSrc){
        System.out.println("Temp            : " + Arrays.toString(temp));
        System.out.println("Output Source   : " + Arrays.toString(outSrc));
    }
}
