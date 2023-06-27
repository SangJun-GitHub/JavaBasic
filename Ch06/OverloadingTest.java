package Ch06;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class MyMath3{
    int add(int a, int b){
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(int a, long b){
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }
    long add(long a, long b){
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }
    int add(int[] a){
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int x : a){
            result += x;
        }
        return result;
    }
}
public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 m3 = new MyMath3();
        System.out.println("m3.add(3,3)     : " + m3.add(3,3));         //int, int
        System.out.println("m3.add(3L,3)    : " + m3.add(3L,3));        //long, long
        System.out.println("m3.add(3,3L)    : " + m3.add(3, 3L));       //int, long
        System.out.println("m3.add(3L, 3L)  : " + m3.add(3L, 3L));      //long, long
        int[] a = {100,200,300};
        System.out.println("m3.add(int[] a) : " + m3.add(a));                 //int[]
    }

}
