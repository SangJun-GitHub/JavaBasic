package Ch8;

/**
 * Created by Sang Jun Park on 6/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(4);
        }catch(Exception e){
            System.out.println(5);
            System.out.println(6);
        }
        System.out.println(7);
        System.out.println(8);
    }
}
