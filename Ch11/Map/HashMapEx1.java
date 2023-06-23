package Ch11.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/23/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter id and password.");
            System.out.print("ID        : ");
            String id = sc.nextLine().trim();

            System.out.print("Password  : ");
            String password = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("Your id is not exist. Re-enter again.");
                continue;
            }else {
                if(!map.get(id).equals(password)){
                    System.out.println("Your password is wrong. Re-enter again.");
                }else {
                    System.out.println("Your id and password are matched.");
                    break;
                }
            }
        }
    }
}
