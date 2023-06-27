package Ch06;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class MyMath2{
    long a, b;

    //Instance method
    long add(){return a + b;}
    long subtract(){return a - b;}
    long multiply(){return a * b;}
    double divide(){return a / b;}

    //Regardless instance, can work with parameters
    static long add(long a, long b){return a + b;}      //local variable
    static long subtract(long a, long b){return a - b;}
    static long multiply(long a, long b){return a * b;}
    static double divide(double a, double b){return a / b;}

}
public class MyMathTest2 {
    public static void main(String[] args) {

        //Call static method, No need an instance
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        MyMath2 m2 = new MyMath2();     //Create an instance
        m2.a = 200L;
        m2.b = 100L;
        //Can call instance method after create an instance
        System.out.println(m2.add());
        System.out.println(m2.subtract());
        System.out.println(m2.multiply());
        System.out.println(m2.divide());
    }
}
