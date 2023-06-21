package Ch11.Iterator.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sang Jun Park on 6/18/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);


        System.out.println("===== Access time test =====");
        System.out.println("ArrayList   :" + access(al));
        System.out.println("LinkedList  :" + access(ll));
    }
    public static void add(List list){
        for(int i = 0; i < 100000; i++)
            list.add(i);
    }
    public static long access(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
