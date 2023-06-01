package Ch7;

/**
 * Created by Sang Jun Park on 6/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx6 {
    Object iv = new Object(){void method(){}};
    static Object cv = new Object(){void method(){}};
    void method(){
        Object lv = new Object(){void method(){}};
    }
}
