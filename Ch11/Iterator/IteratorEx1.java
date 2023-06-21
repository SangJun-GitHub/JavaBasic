package Ch11.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class IteratorEx1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
