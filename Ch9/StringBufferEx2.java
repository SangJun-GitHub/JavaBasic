package Ch9;

/**
 * Created by Sang Jun Park on 6/7/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb  = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println(sb.deleteCharAt(10));
        System.out.println(sb.delete(3,6));
        System.out.println(sb.insert(3,"abc"));
        System.out.println(sb.replace(6, sb.length(), "END"));


        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println("sb  = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);
    }
}
