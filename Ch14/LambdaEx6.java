package Ch14;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

/**
 * Created by Sang Jun Park on 7/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class LambdaEx6 {
    public static void main(String[] args) {
        IntSupplier         s = ()->(int)(Math.random() * 100) + 1;
        IntPredicate        p = i -> i%2 == 0;
        IntConsumer         c = i -> System.out.print(i + ", ");
        IntUnaryOperator   op = i -> i/10*10;

        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));

        printEvenNum(p, c, arr);

        int[] newArr = doSomething(op, arr);
        System.out.println(Arrays.toString(newArr));
    }

    static void makeRandomList(IntSupplier s, int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = s.getAsInt();
    }
    static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr){
        System.out.print("[");
        for(int i : arr){
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }
    static int[] doSomething(IntUnaryOperator op, int[] arr){
        int[] newArr = new int[arr.length];

        for(int i = 0; i < newArr.length; i++)
            newArr[i] = op.applyAsInt(arr[i]);

        return newArr;
    }
}
