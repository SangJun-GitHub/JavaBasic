package Ch11.Iterator.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Sang Jun Park on 6/22/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class Bingo {
    public static void main(String[] args) {
        //Set set = new HashSet();
        Set set = new LinkedHashSet();
        int[][] board = new int [5][5];

        while (set.size() < 25) {
            set.add(String.valueOf((int)(Math.random()*50) + 1));
        }
        /*for(; set.size() < 25; )
            set.add(String.valueOf((int)(Math.random()*50) + 1));*/

        Iterator it = set.iterator();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }

}
