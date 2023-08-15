package Ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sang Jun Park on 8/14/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class FileEx6 {
    static int found = 0;

    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("USAGE : java FileEx6 DIRECTORY KEYWORD");
            System.exit(0);
        }

        File dir = new File(args[0]);
        String keyword = args[1];

        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("Invalid directory");
            System.exit(0);
        }

        try{
            findInFiles(dir, keyword);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println( keyword + " keyword found in total " + found + "lines");
    }

    public static void findInFiles(File dir, String keyword) throws IOException{
        File[] files = dir.listFiles();

        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                findInFiles(files[i], keyword);
            }else{
                String fileName = files[i].getName();
                String extension = fileName.substring(fileName.lastIndexOf(".")+1);
                extension = "," + extension + ",";

                if(",java,txt,bak".indexOf(extension) == -1)
                    continue;

                fileName = dir.getAbsolutePath() + File.separator + fileName;

                FileReader  fr = new FileReader(files[i]);
                BufferedReader br = new BufferedReader(fr);

                String data = "";
                int lineNum = 0;

                while((data = br.readLine()) != null){
                    lineNum++;

                    if(data.indexOf(keyword) != -1){
                        found++;
                        System.out.println("[" + fileName + "(" + lineNum + ")]" + data);
                    }
                }
                br.close();
            }
        }
    }
}
