package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("you are come back to main method");
    }
    static void method1(){
        try{
            System.out.println("method1(0 called");
            return;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("method1() finally block called");
        }
    }
}
