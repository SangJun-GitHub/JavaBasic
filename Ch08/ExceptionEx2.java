package Ch08;

/**
 * Created by Sang Jun Park on 6/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i < 10; i++){
            result = number / (int)(Math.random() * 10);
            System.out.println(result);
        }
    }
}
