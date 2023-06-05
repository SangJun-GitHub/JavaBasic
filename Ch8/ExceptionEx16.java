package Ch8;

import java.io.File;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx16 {
    public static void main(String[] args) {
        try{
            File f = createFile(args[0]);
            System.out.println(f.getName() + " file is successfully created");
        }catch(Exception e){
            System.out.println(e.getMessage() + ", enter again");
        }
    }
    static File createFile(String fileName) throws Exception{
        if(fileName == null || fileName.equals(""))
            throw new Exception("Unveiled file name");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
