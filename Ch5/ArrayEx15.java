package Ch5;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {  ".-", "-...", "-.-.", "-..", ".",
                            "..-.", "--.", "....", "..", ".---",
                            "-.-", ".-..", "--", "-.", "---",
                            ".--.", "--.-", ".-.", "...", "-",
                            "..-", "...-", ".--", "-..-", "-.--",
                            "--.."};

        String result = "";

        for(int i = 0; i < source.length(); i++)
            result += morse[source.charAt(i) - 'A'];

        System.out.println("source : " + source);
        System.out.println("morse  : " + result);
    }
}
