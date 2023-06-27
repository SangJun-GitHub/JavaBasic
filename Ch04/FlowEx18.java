package Ch04;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx18 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <=9; j++)
                System.out.printf("%d * %d = %d\n",i, j, i*j);
            System.out.println();
        }
    }
}
