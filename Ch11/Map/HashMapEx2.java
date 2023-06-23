package Ch11.Map;

import java.util.*;

/**
 * Created by Sang Jun Park on 6/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("java1", new Integer(90));
        map.put("java1", new Integer(100));
        map.put("java2", new Integer(100));
        map.put("java3", new Integer(80));
        map.put("java4", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("Name : " + e.getKey() + ", Score : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("All Name : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("Total           : " + total);
        System.out.println("Average         : " + (float)total/values.size());
        System.out.println("Highest score   : " + Collections.max(values));
        System.out.println("Lowest score    : " + Collections.min(values));

    }
}
