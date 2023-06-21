package Ch11.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();
        System.out.println("== forward ==");
        while(it.hasNext()){

            System.out.print(it.next());
        }
        System.out.println();
        System.out.println();

        System.out.println("== backward ==");
        while(it.hasPrevious()){
            System.out.print(it.previous());
        }
    }
}
