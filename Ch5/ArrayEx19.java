package Ch5;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {   {100,100,100},
                {20, 20, 20},
                {30,30,30},
                {40,40,40,}     };

        int mathTotal = 0, engTotal = 0, freTotal = 0;

        System.out.println("No     Math     English     French     Total     Average");
        System.out.println("========================================================");

        for(int i = 0; i < score.length; i++){
            int sum = 0;
            float avg = 0.0f;

            mathTotal += score[i][0];
            engTotal += score[i][0];
            freTotal += score[i][0];
            System.out.printf("%2d", i+1);

            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
                System.out.printf("%10d", score[i][j]);
            }

            avg = sum/(float)score[i].length;
            System.out.printf("%12d  %10.1f", sum, avg);
            System.out.println();
        }
        System.out.println("========================================================");
        System.out.printf("Total: %5d%10d%10d\n",mathTotal,engTotal,freTotal);
    }
}
