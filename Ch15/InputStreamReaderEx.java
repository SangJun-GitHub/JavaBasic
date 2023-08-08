package Ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sang Jun Park on 8/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line = "";

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Your encoding is : " + isr.getEncoding());

            do{
                System.out.print("Enter a sentence. to exit the program enter q.>");
                line = br.readLine();
                System.out.println("Entered sentences are " + line);
            }while (!line.equalsIgnoreCase("q"));

            System.out.println("Exit the program");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
