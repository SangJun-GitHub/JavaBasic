package Ch15;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Sang Jun Park on 8/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx7 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx7 pattern");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        final String pattern = args[0];

        String[] files = dir.list((dir1, name) -> name.contains(pattern));

        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }
    }
}
