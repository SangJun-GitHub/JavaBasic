package Ch7;

/**
 * Created by Sang Jun Park on 5/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Parent2{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2{}
public class BindingTest2 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
