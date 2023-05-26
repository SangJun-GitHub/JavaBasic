package Ch4;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 100){
            System.out.printf("%2d - %2d\n",i, sum);
        }
    }
}
