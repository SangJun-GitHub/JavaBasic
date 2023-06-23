package Ch11.Iterator.Set;

import java.util.HashSet;

/**
 * Created by Sang Jun Park on 6/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        HashSet set = new HashSet();
        for(int i = 0 ; i < 95; i++){
            set.add(ch++);
        }
        System.out.println(set);
    }
}
