package Ch5;

/**
 * Created by Sang Jun Park on 5/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++)
            arr[i] =  i + 1;

        System.out.println("*** Before ***");
        System.out.println("arr.length:" + arr.length);

        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);

        int[] tmp = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++)
            tmp[i] = arr[i];

        arr = tmp;

        System.out.println("*** After ***");
        System.out.println("arr.length:" + arr.length);
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);
    }
}
