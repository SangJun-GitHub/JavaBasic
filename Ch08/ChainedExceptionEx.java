package Ch08;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}
class SpaceException2 extends Exception{
    SpaceException2(String msg){
        super(msg);
    }
}
class MemoryException2 extends Exception{
    MemoryException2(String msg){
        super(msg);
    }
}
public class ChainedExceptionEx {
    public static void main(String[] args) {
        try{
            install();
        }catch (InstallException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void install() throws InstallException{
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException2 se){
            InstallException ie = new InstallException("Error occurred during installing");
            ie.initCause(se);
            throw ie;
        }catch (MemoryException2 me){
            InstallException ie = new InstallException("Error occurred during installing");
            ie.initCause(me);
            throw ie;
        }finally{
            deleteTempFiles();
        }
    }
    static void startInstall()throws SpaceException2, MemoryException2{
        if(!enoughSpace())
            throw new SpaceException2("Not enough space to install");

        if (!enoughMemory()) {
            throw new MemoryException2("Not enough memory to install");
            //throw new RuntimeException(new MemoryException2("Not enough space to install"));
        }
    }

    static void copyFiles(){}
    static void deleteTempFiles(){}
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
}
