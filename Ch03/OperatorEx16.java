package Ch03;

/**
 * Created by Sang Jun Park on 3/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;   //(int)(3141.592f) / 1000f
                                                    //3141 / 1000f
                                                    //3.141f
        System.out.println(shortPi);
    }
}
