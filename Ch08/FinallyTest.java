package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FinallyTest {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFile();
            deleteTempFiles();
        }catch(Exception e){
            e.printStackTrace();
            deleteTempFiles();
        }
    }
    static void startInstall(){}
    static void copyFile(){}
    static void deleteTempFiles(){}
}
