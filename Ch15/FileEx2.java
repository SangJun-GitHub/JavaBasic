package Ch15;

import java.io.File;

/**
 * Created by Sang Jun Park on 8/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx2 DIRECTORY");
            System.exit(0);
        }

        File f = new File(args[0]);

        if(!f.exists() || !f.isDirectory()){
            System.out.println("Invalided Directory");
            System.exit(0);
        }

        File[] files = f.listFiles();

        for(int i = 0; i < files.length; i++){
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
