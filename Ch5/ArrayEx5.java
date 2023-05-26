package Ch5;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i = 0; i< score.length; i++){
            sum += score[i];
        }

        avg = (float)sum/score.length;

        System.out.println("The total is " + sum);
        System.out.println("The average is " + avg);
    }
}
