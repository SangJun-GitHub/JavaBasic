package Ch4;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx20 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.printf("[%d,%d]", i, j);
            System.out.println();
        }
    }
}
