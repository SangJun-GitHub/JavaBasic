package Ch9;

/**
 * Created by Sang Jun Park on 6/7/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf(".");

        String fileName = fullName.substring(0,index);

        String ext = fullName.substring(index+1);

        System.out.println(fullName + " file name is : " + fileName);
        System.out.println(fullName + " ext is :" + ext);

        String[] sArr = fullName.split("\\.");

        System.out.println(fullName + " file name is : " + sArr[0]);
        System.out.println(fullName + " ext is : " + sArr[1]);
    }
}
