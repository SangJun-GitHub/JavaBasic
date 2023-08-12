package Ch15;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\bobsa\\Desktop\\Study\\Java\\src\\main\\java\\Ch15\\FileEx1.java");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("File name without path          : " + f.getName());
        System.out.println("File name without extension     : " + fileName.substring(0, pos));
        System.out.println("Extension                       : " + fileName.substring(pos + 1));

        System.out.println();
        System.out.println("File name with path             : " + f.getPath());
        System.out.println("Absolute path                   : " + f.getAbsolutePath());
        System.out.println("Canonical path                  : " + f.getCanonicalPath());
        System.out.println("Directories                     : " + f.getParent());

        System.out.println();
        System.out.println("File.pathSeparator              : " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar          : " + File.pathSeparatorChar);
        System.out.println("File.separator                  : " + File.separator);
        System.out.println("File.separatorChar              : " + File.separatorChar);

        System.out.println();
        System.out.println("user.dir                        : " + System.getProperty("user.dir"));
    }
}
