package Ch04;

/**
 * Created by Sang Jun Park on 3/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("Count Down Start!");

        while(i-- != 0){
            System.out.println(i);
            for(long j = 0; j < 3_000_000_000L; j++){}
        }
        System.out.println("Gave Over!");
    }
}
