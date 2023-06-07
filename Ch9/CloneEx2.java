package Ch9;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrClone = arr.clone();

        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
