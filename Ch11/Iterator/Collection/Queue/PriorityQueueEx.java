package Ch11.Iterator.Collection.Queue;


import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(Integer.valueOf(1));
        pq.offer(new Integer(5));
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;
        while((obj = pq.poll()) != null)
            System.out.println(obj);
    }
}
