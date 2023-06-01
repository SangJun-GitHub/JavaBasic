package Ch7;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx1 {
    class InstanceInner{
        int iv = 100;
        //static int cv = 100;          can't declare static variable in instance class
        final static int CONST = 100;   //CONST
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;            //Can declare static variable in static class
    }

    void myMethod(){
        class LocalInner{
            int iv = 300;
            //static int cv = 300;      Can't declare static variable in local class
            final static int CONST = 300;   //CONST
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
