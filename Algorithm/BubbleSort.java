package Algorithm;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = Utilities.initialArray();

        for(int i = arr.length - 1; i > 0; i--){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    Utilities.swap(arr, j, j +1);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }

        Utilities.sortedChecker(arr);
    }
}
