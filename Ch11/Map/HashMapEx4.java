package Ch11.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sang Jun Park on 6/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx4 {
    public static void main(String[] args) {

        String[] data = {"A","A","A","B","B","C","C","C","C","C","D","E","E"};

        HashMap map = new HashMap();

        for(int i = 0; i < data.length; i++){
            if(map.containsKey(data[i])){
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], value + 1);
            }else{
                map.put(data[i], 1);
            }
        }

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            int value = (Integer) entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }
    public static String printBar(char ch, int value){
        char[] bar = new char[value];

        Arrays.fill(bar,'#');

        return new String(bar);
    }
}
