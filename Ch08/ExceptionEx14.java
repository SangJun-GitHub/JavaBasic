package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println("Exception was thrown on main method");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception{
        throw new Exception();
    }
}
