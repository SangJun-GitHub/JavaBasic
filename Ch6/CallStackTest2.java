package Ch6;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) started");
        firstMethod();
        System.out.println("main(String[] args) ended");
    }
    static void firstMethod(){
        System.out.println("firstMethod() started");
        secondMethod();
        System.out.println("firstMethod() ended");
    }
    static void secondMethod(){
        System.out.println("secondMethod() started");
        System.out.println("secondMethod() ended");
    }
}
