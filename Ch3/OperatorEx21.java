package Ch3;

/**
 * Created by Sang Jun Park on 3/15/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f\t\t %b\n", 10 == 10.0f);         //10.0f == 10.0f    true
        System.out.printf("'0' == 0\t\t %b\n", '0'==0);                 //48 == 0           false
        System.out.printf("'A' == 65\t\t %b\n", 'A'==65);               //65 == 65          true
        System.out.printf("'A' > 'B'\t\t %b\n", 'A' > 'B');             //65 > 66           false
        System.out.printf("'A'+1 != 'B'\t %b\n", 'A' + 1 != 'B');       //66 != 66          false
    }
}
