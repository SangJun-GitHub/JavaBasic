package Ch8;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception{
        throw new Exception();
    }
}
