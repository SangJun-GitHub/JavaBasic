package Ch7;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */

class A {
    public void methodA(B b){
        b.methodB();
    }
}
class B {
    public void methodB(){
        System.out.println("methodB()");
    }
}
public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.methodA(new B());
    }
}
