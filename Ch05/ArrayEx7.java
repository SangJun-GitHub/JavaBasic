package Ch05;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        for(int i = 0; i < numArr.length; i++){
            int n = (int) (Math.random() * 10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
