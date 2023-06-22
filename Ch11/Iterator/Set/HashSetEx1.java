package Ch11.Iterator.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sang Jun Park on 6/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};

        Set set = new HashSet();
        for(Object o : objArr){
            set.add(o);
        }

        System.out.println(set);
    }
}
