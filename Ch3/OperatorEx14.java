package Ch3;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';

        for(int i = 0; i < 26; i++){
            System.out.print(c++);      //abcdefghijklmnopqrstuvwxyz
        }
        System.out.println();

        c = 'A';
        for(int i = 0; i < 26; i++){
            System.out.print(c++);      //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        }
        System.out.println();

        c = '0';
        for(int i = 0; i < 10; i++){
            System.out.print(c++);       //0123456789
        }
    }
}
