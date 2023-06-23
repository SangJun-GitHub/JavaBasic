package Ch11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sang Jun Park on 6/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("Friend", "java1", "000-000-1111");
        addPhoneNo("Friend", "java2", "000-000-2222");
        addPhoneNo("Friend", "java2", "000-000-3333");
        addPhoneNo("Company", "java3", "000-000-4444");
        addPhoneNo("Company", "java3", "000-000-5555");
        addPhoneNo("Company", "java4", "000-000-6666");
        addPhoneNo("Company", "java5", "000-000-7777");
        addPhoneNo("home",  "000-000-8888");

        printList();


    }
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }
    static void addPhoneNo(String name, String tel){
        addPhoneNo("etc.", name, tel);
    }
    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel,name);
    }
    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while(subIt.hasNext()){
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}
