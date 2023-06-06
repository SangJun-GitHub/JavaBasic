package Ch8;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx17 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("Solved exception in main method");
        }
    }
    static void method1() throws Exception{
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("Solved exception in method1() method");
            throw e;
        }
    }
}
