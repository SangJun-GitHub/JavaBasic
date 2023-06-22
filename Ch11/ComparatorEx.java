package Ch11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Sang Jun Park on 6/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog","lion","tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);         //Ignore case insensitive
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());                      //Descending sort
        System.out.println("strArr=" + Arrays.toString(strArr));
    }
}
class Descending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(o2) * - 1;  // * - 1 for Descending
        }
        return -1;
    }
}
