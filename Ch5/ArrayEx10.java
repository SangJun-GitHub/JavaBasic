package Ch5;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++)
            System.out.print(numArr[i] = (int)(Math.random() * 10));

        System.out.println();

        for(int i = 0; i < numArr.length -1; i++){
            boolean changed = false;
            for(int j = 0; j < numArr.length-1-i; j++){
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }
            if(!changed)
                break;

            for(int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }




    }
}
