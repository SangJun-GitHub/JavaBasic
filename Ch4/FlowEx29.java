package Ch4;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx29 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.printf("i=%d ", i);
            int tmp = i;

            do{
                if(tmp%10%3 == 0 && tmp%10 != 0)
                    System.out.print("clap ");
            }while((tmp/=10) != 0);

            System.out.println();
        }
    }
}
