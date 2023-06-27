package Ch07;

/**
 * Created by Sang Jun Park on 6/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Outer2{
    int value = 10;     //Outer2.this.value

    class Inner{
        int value = 20; //this.value
        void method(){
            int value = 30;
            System.out.println("           value : " + value);              //30
            System.out.println("      this.value : " + this.value);         //20
            System.out.println("Outer.this.value : " + Outer2.this.value);  //10
        }
    }


}
public class InnerEx5 {
    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2().new Inner();
        inner.method();
    }
}
