package Ch8;

/**
 * Created by Sang Jun Park on 6/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("Intended exception");
            throw e;
            //throw new Exception("Intended exception");
        }catch(Exception e){
            System.out.println("Exception Message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program terminated normally");
    }
}
