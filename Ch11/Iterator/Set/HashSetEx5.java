package Ch11.Iterator.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Sang Jun Park on 6/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA        = new HashSet();
        HashSet setB        = new HashSet();
        HashSet setSum      = new HashSet();
        HashSet setInter    = new HashSet();
        HashSet setDiff     = new HashSet();

        setA.add("1"); setA.add("2"); setA.add("3");
        setA.add("4"); setA.add("5");
        System.out.println("A           =" + setA);

        setB.add("4"); setB.add("5"); setB.add("6");
        setB.add("7"); setB.add("8");
        System.out.println("B           =" + setB);

        Iterator it = setA.iterator();
        while(it.hasNext())
            setSum.add(it.next());
        it = setB.iterator();
        while(it.hasNext())
            setSum.add(it.next());


        it = setA.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setDiff.add(tmp);
        }


        it = setB.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(setA.contains(tmp))
                setInter.add(tmp);
        }

        System.out.println("A ∩ B       =" + setSum);
        System.out.println("A ∪ B       =" + setInter);
        System.out.println("A - B       =" + setDiff);

    }
}
