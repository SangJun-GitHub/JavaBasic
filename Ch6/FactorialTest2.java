package Ch6;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FactorialTest2 {
    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for(int i = 1; i <= n; i++){
            result = factorial(i);

            if(result == -1){
                System.out.printf("Invalid value. (0 < n <= 20): %d\n", n);
                break;
            }

            System.out.printf("%2d!=%20d\n", i , result);
        }
    }

    static long factorial(int x){
        if(x < 0 || x > 20)
            return -1;
        if(x == 1)
            return 1;
        return x * factorial(x - 1);
    }
}
