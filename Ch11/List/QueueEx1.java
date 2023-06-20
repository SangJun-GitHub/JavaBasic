package Ch11.List;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args){
        System.out.println("Type the word \"help\" for help");

        while(true){
            System.out.print(">>");
            try{
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input))
                    continue;

                if(input.equalsIgnoreCase("q"))
                    System.exit(0);
                else if(input.equalsIgnoreCase("help")){
                    System.out.println("help    - Show help.");
                    System.out.println("q or Q  - Exit this program.");
                    System.out.println("history - Show recent " + MAX_SIZE + " commands.");
                }else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext())
                        System.out.println(++i + "." + it.next());
                }else{
                    save(input);
                    System.out.println(input);
                }
            }catch(Exception e){
                System.out.println("Input error");
            }
        }
    }
    public static void save(String input){
        if(!"".equals(input))
            q.offer(input);

        if(q.size() > MAX_SIZE)
            q.poll();
    }
}
