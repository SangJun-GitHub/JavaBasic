package Ch2;

/**
 * Created by Sang Jun Park on 2/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.google.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        float f4 = 1.23e-4f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g\n", f1, f1, f1);
        System.out.printf("f1=%f, %e, %g\n", f2, f2, f2);
        System.out.printf("f1=%f, %e, %g\n", f3, f3, f3);
        System.out.printf("f1=%f, %e, %g\n\n", f4, f4, f4);

        System.out.printf(" [12345678901234567890]\n");
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%014.10f\n", d);
        System.out.printf("d=%14.10f\n\n", d); //  1.2345678900


        System.out.printf("[12345678901234567890]\n");
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%20.8s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
