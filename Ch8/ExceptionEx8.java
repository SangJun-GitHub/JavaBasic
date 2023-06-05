package Ch8;

/**
 * Created by Sang Jun Park on 6/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("Exception Message : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
