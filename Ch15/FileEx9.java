package Ch15;

import java.io.File;

/**
 * Created by Sang Jun Park on 8/16/2023.
 * Github : http://github.com/SangJun-GitHub
 */
//java FileEx9.java ../../resources/x
public class FileEx9 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx9 DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if(!dir.isDirectory() || !dir.exists()){
            System.out.println("Invalid directory");
            System.exit(0);
        }

        File[] files = dir.listFiles();

        for(int i = 0; i < files.length; i++){
            String fileName = files[i].getName();

            String newFileName = "000000" + fileName;
            newFileName = newFileName.substring(newFileName.length() - 7);
            files[i].renameTo(new File(dir, newFileName));
        }
    }
}
