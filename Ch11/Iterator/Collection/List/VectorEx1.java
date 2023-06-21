package Ch11.Iterator.Collection.List;

import java.util.Vector;

/**
 * Created by Sang Jun Park on 6/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);       //capacity 5

        v.add("1");
        v.add("2");
        v.add("3");
        print(v);                                                       //s3 c5

        v.trimToSize();
        System.out.println("===== After trimToSize() =====");
        print(v);                                                       //s3 c3

        v.ensureCapacity(10);
        System.out.println("===== After ensureCapacity(10) =====");
        print(v);                                                       //s3 c10


        v.setSize(11);
        System.out.println("===== After setSize(11) =====");
        print(v);                                                       //s10 c>10

        v.clear();
        System.out.println("===== After clear() =====");
        print(v);                                                       //s0 c>10
    }
    public static void print(Vector v){
        System.out.println(v);
        System.out.println("size    :"+ v.size());          //usage
        System.out.println("capacity:" + v.capacity());
        System.out.println();
    }
}
