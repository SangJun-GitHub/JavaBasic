package Ch6;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for(int i = 0; i < 3; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i].channelUp();
        }


    }
}
