package Ch7;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InnerEx2 {
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner();
    StaticInner cv = new StaticInner();

    static void staticMethod(){
        //static member can't access to instance member
        //InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        //For accessing to instance member
        //Create outer then access to them
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        //Can not access local class from outer
        //LocalInner lv = new LocalInner();
    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
