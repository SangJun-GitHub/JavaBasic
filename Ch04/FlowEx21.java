package Ch04;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i == j)
                    System.out.printf("[%d,%d]",i,j);
                else
                    System.out.printf("%5c", ' ');
            }
            System.out.println();
        }
    }
}
