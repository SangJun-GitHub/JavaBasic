package Ch06;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println(sumArr(arr));
    }

    static void printArr(int[] arr){
        System.out.print("[");
        for(int x : arr)
            System.out.print(x+ ",");
        System.out.println("]");
    }

    static int sumArr(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++)
            total += arr[i];
        return total;
    }

    static void sortArr(int[] arr){
        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = 0; j < arr.length - 1 - i; j++ ){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
