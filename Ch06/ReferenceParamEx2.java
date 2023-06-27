package Ch06;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);         //10

        change(x);
        System.out.println("After change(x)");
        System.out.println("change() : x = " + x[0]);       //1000

    }
    static void change(int[] x){
        x[0] = 1000;
        System.out.println();
        System.out.println("change() : x = " + x[0]);       //1000
    }
}
