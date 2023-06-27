package Ch05;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();


        for(int j = 0; j < numArr.length; j++)
            counter[numArr[j]]++;


        for(int i = 0; i < counter.length; i++)
            System.out.printf("%d's number is %d\n", i, counter[i]);


    }
}
