package Ch09;

/**
 * Created by Sang Jun Park on 6/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        //Integer i = Integer.valueOf(100);
        //Integer i = 100;
        Integer i2 = new Integer(100);

        System.out.println("i == i2         ? " + (i == i2));           //false
        System.out.println("i.equals(i2)    ? " + i.equals(i2));        //ture
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));     //0
        System.out.println("i.toString()    = " + i.toString());        //100

        System.out.println("MAX_VALUE       = " + Integer.MAX_VALUE);   //2147483647
        System.out.println("MIN_VALUE       = " + Integer.MIN_VALUE);   //-2147483648

        System.out.println("SIZE            = " + Integer.SIZE);        //32 bits
        System.out.println("BYTES           = " + Integer.BYTES);       //4  bytes
        System.out.println("TYPE            = " + Integer.TYPE);        //int


    }
}
