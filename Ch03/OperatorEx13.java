package Ch03;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        //char c2 = c1 + 1;     error because the result is int type
        char c2 = 'a' + 1;      //The literal is not change during the execution process
                                //when compiling, the compiler replace the literal after calculate

        char c3 = (char)(c1 + 1);
        System.out.println(c2);     //b
        System.out.println(c3);     //b
    }
}
