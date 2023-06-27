package Ch03;

/**
 * Created by Sang Jun Park on 3/15/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx22 {
    public static void main(String[] args) {
        float   f = 0.1f;
        double  d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 == 10.0f %b\n", 10.0==10.0f);   //true
        System.out.printf("0.1 == 0.1f %b\n",0.1 == 0.1f);      //0.1_000_000_000_000_000_0 == 0.1_000_000_014_901_161_2 false
        System.out.printf("f = %19.17f\n", f);                  //0.1_000_000_014_901_161_2
        System.out.printf("d = %19.17f\n", d);                  //0.1_000_000_000_000_000_0
        System.out.printf("d2 = %19.17f\n", d2);                //0.1_000_000_014_901_161_2

        System.out.printf("d==f %b\n", d==f);                   //0.1_000_000_000_000_000_0 == 0.1_000_000_014_901_161_2 false
        System.out.printf("d==d2 %b\n", d==d2);                 //0.1_000_000_000_000_000_0 == 0.1_000_000_014_901_161_2 false
        System.out.printf("d2==f %b\n", d2==f);                 //0.1_000_000_014_901_161_2 == 0.1_000_000_014_901_161_2 true
        System.out.printf("(float)d==f %b\n", (float)d==f);     //0.1_000_000_014_901_161_2 == 0.1_000_000_014_901_161_2 true
    }
}
