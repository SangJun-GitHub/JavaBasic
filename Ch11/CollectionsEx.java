package Ch11;

import java.util.*;

/**
 * Created by Sang Jun Park on 6/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list : " + list);

        Collections.addAll(list, 1,2,3,4,5);
        System.out.println("list : " + list);

        Collections.rotate(list, 2);                    //Move two spaces to the right
        System.out.println("list : " + list);                               //4,5,1,2,3

        Collections.swap(list, 0 , 2);
        System.out.println("list : " + list);                               //1,5,4,2,3

        Collections.shuffle(list);
        System.out.println("list : " + list);

        Collections.sort(list);
        System.out.println("list : " + list);                               //1,2,3,4,5

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list : " + list);                               //5,4,3,2,1

        int index = Collections.binarySearch(list, 3);
        System.out.println("Index of 3  = " + index);

        System.out.println("max         = " + Collections.max(list));
        System.out.println("min         = " + Collections.min(list));
        System.out.println("min         = " + Collections.max(list, Collections.reverseOrder()));

        Collections.fill(list, 9);
        System.out.println("list : " + list);

        List newList = Collections.nCopies(list.size(), 2);     //create new list : size = list.size, fill 2
        System.out.println("newList : " + newList);

        System.out.println(Collections.disjoint(list,newList));     //No same object = ture


        Collections.copy(list, newList);
        System.out.println("newList : " + newList);
        System.out.println("list : " + list);

        Collections.replaceAll(list, 2, 1);             //2 -> 1
        System.out.println("list : " + list);


        Enumeration e = Collections.enumeration(list);
        ArrayList list2 = Collections.list(e);
        System.out.println("list2 : " + list2 );
    }
}
