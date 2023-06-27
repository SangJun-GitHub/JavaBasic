package Ch07;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}

class Parent4{
    public void method2(){
        System.out.println("method2() in Parent4");
    }
}
class Child4 extends Parent4 implements MyInterface{
    @Override
    public void method1() {
        System.out.println("method1() in Child4");
    }
}
public class DefaultMethodTest {
    public static void main(String[] args) {
        Child4 c =  new Child4();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
