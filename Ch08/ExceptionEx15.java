package Ch08;

import java.io.*;


/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " file is successfully created");
    }
    static File createFile(String fileName){
        try{
            if(fileName==null || fileName.equals(""))
                throw new Exception("Unveiled file name");
        }catch (Exception e){
            fileName = "Untitled.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }
    static void createNewFile(File f){
        try{
            f.createNewFile();
        }catch(Exception e){

        }
    }
}
