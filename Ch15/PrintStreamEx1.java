package Ch15;

import java.util.Date;

/**
 * Created by Sang Jun Park on 8/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PrintStreamEx1 {
    public static void main(String[] args){
        int     i = 65;
        float   f = 1234.56789f;
        Date    d = new Date();

        System.out.printf("Character %c's code is %d\n", i, i);
        System.out.printf("Number %d's octal is %o, hexadecimal is %x\n", i, i, i);
        System.out.printf("%3d%3d%3d\n", 100, 90, 8);

        System.out.println();

        System.out.printf("123456789012345678901234567890\n");
        System.out.printf("%s%-5s%5s\n", "123", "123", "123");

        System.out.println();

        System.out.printf("%-8.1f%8.1f %e\n", f, f, f);

        System.out.println();

        System.out.printf("Today is %tm-%td-%tY\n",d, d, d);
        System.out.printf("Now is %tH:%tM:%tS\n",d,d,d);
        System.out.printf("Now is %1$tH:%1$tM:%1$tS\n",d);
    }
}
