package Ch06;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;                                   //Instance variable can use static variable
    //static int cv2 = iv;                          //Static variable can't use instance variable
    int cv2 = new MemberCall().iv;                  //After create instance, static variable can use instance variable

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv);                   //Static method can't use instance variable
        System.out.println(new MemberCall().iv);    //After create instance, static method can use instance variable
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1()                         //Static method can't use instance method
        MemberCall m2 = new MemberCall();
        m2.instanceMethod1();                       //After create instance, static method can use instance method
    }

    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }
}
