package Ch8;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}
public class NewExceptionTest {
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace())
            throw new SpaceException("Not enough space to install");
        if(!enoughMemory())
            throw new MemoryException("Not enough memory to install");
    }
    static void copyFiles(){}
    static void deleteTempFiles(){}

    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }

    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
        }catch(SpaceException se){
            System.out.println("Error message : " + se.getMessage());
            se.printStackTrace();
            System.out.println("Please re-install after getting enough space");
        }catch (MemoryException me){
            System.out.println("Error message : " + me.getMessage());
            me.printStackTrace();
            System.gc();                                //Calling Garbage Collection
            System.out.println("Try again to install");
        }finally {
            deleteTempFiles();
        }
    }
}
