package Algorithm;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = Utilities.initialArray();

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            Utilities.swap(arr, i, min);
        }

        Utilities.sortedChecker(arr);

    }
}
