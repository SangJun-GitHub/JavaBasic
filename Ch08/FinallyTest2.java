package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FinallyTest2 {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            deleteTempFiles();
        }
    }

    static void startInstall(){}
    static void copyFiles(){}
    static void deleteTempFiles(){}
}
