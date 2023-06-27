package Ch04;

/**
 * Created by Sang Jun Park on 3/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx31 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            if(i%3==0)
                continue;
            System.out.println(i);
        }
    }
}
