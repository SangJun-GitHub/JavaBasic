package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';          //97
        char c2 = c1;           //c2 = a
        char c3 = ' ';

        int i  = c1 + 1;        //98
        c3 = (char)(c1 + 1);    //'b'
        c2++;                   //c2 = 'b'
        c2++;                   //c2 = 'c'

        System.out.println("i=" + i);   //98
        System.out.println("c2=" + c2);  //'c'
        System.out.println("c3=" + c3);  //'b'
    }
}
