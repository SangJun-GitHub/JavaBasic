package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' = %d\n", a, (int)a);                        //97
        System.out.printf("'%c' = %d\n", d, (int)d);                        //100
        System.out.printf("'%c' = %d\n", zero, (int)zero);                  //48
        System.out.printf("'%c' = %d\n", two, (int)two);                    //50
        System.out.printf("'%c' - '%c' = %d\n", d, a, d-a);                 //'d' - 'a' = 3     100 - 97
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);     //'2' - '0' = 2     50 - 48

    }
}
