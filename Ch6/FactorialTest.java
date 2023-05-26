package Ch6;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(int n){
/*        int result = 0;
        if(n == 1)
            return 1;
        else
            result = n * factorial(n - 1);

        return result;*/
        if(n <= 0 || n > 12)
            return -1;
        if(n ==1)
            return 1;
        return n * factorial(n - 1);

    }
}
