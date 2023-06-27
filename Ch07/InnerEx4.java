package Ch07;

/**
 * Created by Sang Jun Park on 6/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Outer {
    class InstanceInner{
        int iv = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }

    void method(){
        class LocalInner{
            int iv = 400;
        }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {
        //For creating instance to instance class, must create outer class first
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);     //100
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);   //300

        //For accessing instances in static class, not necessary to create Outer class
        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv : " + si.iv);     //200
    }
}
