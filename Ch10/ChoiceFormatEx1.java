package Ch10;

import java.text.ChoiceFormat;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60,70,80,90};
        String[] grades = {"D","C","B","A"};

        int[] scores = {100,95,88,70,52,60,70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }
    }
}
