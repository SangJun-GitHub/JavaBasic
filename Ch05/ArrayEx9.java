package Ch05;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length; i++){
            int n = (int)(Math.random() * code.length);
            arr[i] = code[n];
        }

        System.out.println(Arrays.toString(arr));
    }
}
