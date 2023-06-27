package Ch05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];

        for(char[] row : board){
            Arrays.fill(row, ' ');
        }
                            //   1 2 3 4 5 6 7 8 9
        byte[][] shipBoard = {  {0,0,0,0,0,0,1,0,0},
                                {1,1,1,1,0,0,1,0,0},
                                {0,0,0,0,0,0,1,0,0},
                                {0,0,0,0,0,0,1,0,0},
                                {0,0,0,0,0,0,0,0,0},
                                {1,1,0,1,0,0,0,0,0},
                                {0,0,0,1,0,0,0,0,0},
                                {0,0,0,1,0,0,0,0,0},
                                {0,0,0,0,0,1,1,1,0}
                            };

        for(int i = 1; i < SIZE; i++)
            board[0][i] = board[i][0] = (char)(i+'0');

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Type coordinate.(exit is 00)>");
            String input = sc.nextLine();

            if(input.length() == 2){
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if(x == 0 && y == 0)
                    break;
            }

            if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE){
                System.out.println("Wrong input. Try again");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

            for(int i = 0; i < SIZE; i++)
                System.out.println(board[i]);
            System.out.println();


        }
    }
}
