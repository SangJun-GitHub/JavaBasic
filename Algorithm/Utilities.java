package Algorithm;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class Utilities {

    static int[] initialArray(){
        int[] arr = {1,9,4,6,11,10,3,15,2,13};
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    static void sortedChecker(int[] arr){
        System.out.println(Arrays.toString(arr));
        boolean sorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]> arr[i+1])
                sorted = false;
        }

        if(sorted)
            System.out.println("It is sorted");
        else
            System.out.println("It is unsorted");
    }
}
