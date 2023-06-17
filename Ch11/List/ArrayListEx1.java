package Ch11.List;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sang Jun Park on 6/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(2);
        list1.add(0);
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));        //4,2,0
        ArrayList list3 = new ArrayList(list1.subList(0, list1.size()));
        print(list1, list2, list3);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2, list3);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add("A");
        print(list1, list2, list3);

        list2.set(3, "AA");
        print(list1, list2, list3);

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
        print(list1, list2, list3);

        for(int i = list2.size() -1; i >= 0; i--){
            if(list1.contains(list2.get(i)))
                list1.remove(i);
        }


        for(int i = list2.size() -1; i >= 0; i--){
            if(list3.contains(list2.get(i)))
                list3.remove(list2.get(i));
        }
        print(list1, list2, list3);


    }
    public static void print(ArrayList list1, ArrayList list2, ArrayList list3){
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
        System.out.println();
    }
}
