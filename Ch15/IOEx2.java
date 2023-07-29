package Ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Created by Sang Jun Park on 7/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class IOEx2 {
    public static void main(String[] args) {
        byte[] inSrc    = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc   = null;
        byte[] temp     = new byte[10];

        ByteArrayInputStream input      = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output    = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length);
        output.write(temp, 5,5);

        outSrc = output.toByteArray();

        System.out.println("Input Source    : " + Arrays.toString(inSrc));
        System.out.println("Temp            : " + Arrays.toString(temp));
        System.out.println("Output Source   : " + Arrays.toString(outSrc));
    }
}
