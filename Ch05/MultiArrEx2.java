package Ch05;

import java.util.Scanner;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++)
                bingo[i][j] = i * SIZE + j + 1;
        }

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);

                int tmp = bingo[x][y];
                bingo[x][y] = bingo[i][j];
                bingo[i][j] = tmp;
            }
        }

        do{
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);
                System.out.println();
            }
            System.out.println();

            System.out.printf("Type a number between 1 ~ %2d. (exit:0)>", SIZE*SIZE);
            String tmp = sc.nextLine();

            num = Integer.parseInt(tmp);

            outer:
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    if(bingo[i][j]==num){
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        }while(num != 0);
    }
}
