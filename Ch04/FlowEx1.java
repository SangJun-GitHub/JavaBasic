package Ch04;

/**
 * Created by Sang Jun Park on 3/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;

        System.out.printf("if x=%d, true is \n", x);

        if(x == 0) System.out.println("x == 0");            //printed
        if(x != 0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");      //printed

        x = 1;
        System.out.printf("if x=%d, true is \n", x);

        if(x == 0) System.out.println("x == 0");
        if(x != 0) System.out.println("x != 0");            //printed
        if(!(x == 0)) System.out.println("!(x == 0)");      //printed
        if(!(x != 0)) System.out.println("!(x != 0)");
    }
}
