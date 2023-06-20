package Ch11.List;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Sang Jun Park on 6/19/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");                //LIFO - Last In First Out
        while(!st.empty())
            System.out.println(st.pop());

        System.out.println("= Queue =");                //FIFO - First In First Out
        while(!q.isEmpty())
            System.out.println(q.poll());
    }
}
