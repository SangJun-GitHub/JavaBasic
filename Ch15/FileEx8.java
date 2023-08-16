package Ch15;

import java.io.File;

/**
 * Created by Sang Jun Park on 8/15/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx8 {
    static int deletedFiles = 0;

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx8 Extension");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        String ext = "." + args[0];

        delete(dir, ext);
        System.out.println("deleted " + deletedFiles + " files");
    }

    public static void delete(File dir, String ext){
        File[] files = dir.listFiles();

        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                delete(files[i], ext);
            } else {
                String fileName = files[i].getName();

                if(fileName.endsWith(ext)){
                    System.out.print(fileName);

                    if(files[i].delete()){
                        System.out.println(" - success delete.");
                        deletedFiles++;
                    } else {
                        System.out.println(" - fail delete.");
                    }
                }
            }
        }
    }
}
