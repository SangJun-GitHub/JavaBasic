package Ch05;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};

        int min = score[0];
        int max = score[0];

        for(int i = 0; i < score.length; i++){
            if(score[i]<min)
                min = score[i];
            if(score[i]>max)
                max = score[i];
        }
        System.out.println("The min number is " + min);
        System.out.println("The max number is " + max);
    }
}
