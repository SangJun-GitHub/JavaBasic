package Ch8;

/**
 * Created by Sang Jun Park on 6/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx1 {
    public static void main(String[] args) {
        try{
            try{}catch(Exception e){}
        }catch(Exception e){
            try{}catch(Exception e1){}
        }

        try{

        }catch(Exception e){

        }
    }
}
