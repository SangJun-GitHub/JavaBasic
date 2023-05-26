package Algorithm;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = Utilities.initialArray();

        for(int i = 1; i < arr.length; i++){
            int index = i;
            while(index > 0 && arr[index -1]>arr[index]){
                Utilities.swap(arr, index - 1, index);
                index--;
            }
        }
        Utilities.sortedChecker(arr);
    }
}
