package Ch07;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner{
        int iiv = outerIv;  //Can access members even though they are declared as private
        int iiv2 = outerCv;
    }

    static class StaticInner{
        //static class can't access to instance member
        //int siv = outerIv;
        static int scv = outerCv;
    }
    void myMethod(){
        int lv = 0;
        final int LV = 0;       //Over JDK 1.8, final keyword is not mandatory

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;

            //Only can access CONST members but //Over JDK 1.8, final keyword is not mandatory
            int liv3 = lv;
            int liv4 = LV;
        }

    }
}
