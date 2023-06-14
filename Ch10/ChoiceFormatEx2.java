package Ch10;

import java.text.ChoiceFormat;

/**
 * Created by Sang Jun Park on 6/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores = {91,90,80,88,70,52,60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }
    }
}
