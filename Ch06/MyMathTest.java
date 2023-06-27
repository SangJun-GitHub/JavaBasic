package Ch06;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class MyMath{
    long add(long a, long b){ return a + b; }
    long subtract(long a, long b){ return a - b; }
    long multiply(long a, long b){ return a * b; }
    double divide(double a, double b){ return a / b;}
}
public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5l, 3l) = " + result1);
        System.out.println("subtract(5l, 3l) = " + result2);
        System.out.println("multiply(5l, 3l) = " + result3);
        System.out.println("divide(5l, 3l) = " + result4);
    }
}
