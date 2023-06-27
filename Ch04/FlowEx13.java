package Ch04;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
            System.out.printf("The sum of from 1 to %2d : %2d\n", i , sum);
        }
    }
}
