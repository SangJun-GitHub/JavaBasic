package Ch11.Iterator.Collection.List;

import java.util.Iterator;

/**
 * Created by Sang Jun Park on 6/21/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MyVector2Test {
    public static void main(String[] args) {
        MyVector2 v = new MyVector2();

        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("Before removing :" + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("After removing  :"+v);
    }
}
