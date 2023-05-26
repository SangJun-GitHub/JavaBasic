package Ch5;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[]{100,95,80,70,60};
        int[] iArr4 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};

        for(int i = 0; i < iArr1.length; i++){
            iArr1[i] = i + 1;                           //{1,2,3,4,5,6,7,8,9,10}
        }

        for(int i = 0; i < iArr1.length; i++){
            iArr2[i] = (int)(Math.random()*10) + 1;     //between 1 ~ 10
        }

        for(int i = 0; i < iArr1.length; i++){
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));     //10 random number
        System.out.println(Arrays.toString(iArr3));     //[100, 95, 80, 70, 60]
        System.out.println(Arrays.toString(iArr4));     //[100, 95, 80, 70, 60]
        System.out.println(Arrays.toString(chArr));     //[a, b, c, d]
        System.out.println(iArr4);                      //[I@4aa298b7  might be changed by running
        System.out.println(chArr);                      //abcd


    }
}
