package Ch04;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < 5; i++)
            System.out.printf("%d ", arr[i]);

        System.out.println();

        for(int x : arr) {
            System.out.printf("%d ", x);
            sum += x;
        }
        System.out.println();
        System.out.printf("sum = %d\n",sum);
    }
}
