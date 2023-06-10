package Ch9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;
/**
 * Created by Sang Jun Park on 6/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D    = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D_2  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.print("str2D     = {");
        for(String[] tmp : str2D)
            System.out.print(Arrays.toString(tmp));
        System.out.println("}");

        System.out.print("str2D_2   = {");
        for(String[] tmp : str2D_2)
            System.out.print(Arrays.toString(tmp));
        System.out.println("}");

        System.out.println("equals(str2D, str2D_2)      =" + Objects.equals(str2D,str2D_2));        //false
        System.out.println("deepEquals(str2D, str2D_2)  =" + Objects.deepEquals(str2D, str2D_2));   //ture

        System.out.println("isNull(null)        = " + isNull(null));                           //ture
        System.out.println("nonNull(null)       = " + nonNull(null));                          //false

        System.out.println("hashCode(null)      = " + Objects.hashCode(null));                  //0
        System.out.println("toString(null)      = " + Objects.toString(null));                  //null
        System.out.println("toString(null,\"\") = " + Objects.toString(null,""));      //

        Comparator c = String.CASE_INSENSITIVE_ORDER;
        System.out.println("compare(\"aa\",\"bb\")=" + compare("aa","bb", c));      //-1
        System.out.println("compare(\"bb\",\"aa\")=" + compare("bb","aa", c));      //1
        System.out.println("compare(\"ab\",\"AB\")=" + compare("ab","AB", c));      //0

    }
}
