package Ch9;

import java.math.BigInteger;

/**
 * Created by Sang Jun Park on 6/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class BigIntegerEx {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i < 100; i ++){
            System.out.printf("%d!=%s\n",i ,calcFactorial(i));
            Thread.sleep(300);
        }
    }

    static String calcFactorial(int n){
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO))
            return  BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
