package Ch4;

/**
 * Created by Sang Jun Park on 3/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true){
            if(sum > 100)
                break;
            ++i;
            sum+=i;
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}
