package Ch13;

/**
 * Created by Sang Jun Park on 6/28/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx3 {
    public static void main(String[] args) throws Exception {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();                                               //run
    }
}
class ThreadEx3_1 extends Thread{
    public void run(){
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
