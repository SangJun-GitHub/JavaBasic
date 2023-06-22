package Ch11.Iterator.Set;

import java.util.*;

/**
 * Created by Sang Jun Park on 6/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        System.out.println("set  : " + set);


        List list = new LinkedList(set);        //LinkedList(Collection c)
        Collections.sort(list);
        System.out.println("list : " +list);

    }
}
