package Ch7;

/**
 * Created by Sang Jun Park on 5/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Parent3{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}
class Child3 extends Parent3{
    int x = 200;

    void method(){
        System.out.println("x = " + x);                 //200
        System.out.println("super.x = " + super.x);     //100
        System.out.println("this.x = " + this.x);       //200
    }
}
public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);             //100
        p.method();                                     //200 100 200

        System.out.println();

        System.out.println("c.x = " + c.x);             //200
        c.method();                                     //200 100 200

    }
}
