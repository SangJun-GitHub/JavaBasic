package Ch6;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod");
    }
}
