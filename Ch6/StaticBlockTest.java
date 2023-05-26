package Ch6;

/**
 * Created by Sang Jun Park on 5/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StaticBlockTest {
    static int[] arr = new int[10];

    static {
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"] : " + arr[i]);
    }
}
