package Ch07;

/**
 * Created by Sang Jun Park on 5/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Parent{
    int x = 10;
}
class Child extends Parent{
    int x = 20;
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }

}
public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        c.x = 50;
        c.method();
    }
}
