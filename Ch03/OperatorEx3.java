package Ch03;

/**
 * Created by Sang Jun Park on 3/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx3 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++);                            //5
        System.out.println(++j);                             //6
        System.out.println("i = " + i + ", j = " + j);      //6 6

        int x = 5;
        x = x++ - ++x;
        System.out.println(x);
    }
}
