package Ch03;

/**
 * Created by Sang Jun Park on 3/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx2 {
    public static void main(String[] args) {
        int i =5, j = 0;

        j = i++;
        System.out.println("j=i++; after, i = " + i + ", j = " + j);    //6 5

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=++i; after, i = " + i + ", j = " + j);    //6 6
    }
}
