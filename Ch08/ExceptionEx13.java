package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println("Exception was thrown on method1 method");
            e.printStackTrace();
        }
    }
}
