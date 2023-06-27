package Ch07;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
interface I{
    public abstract void play();
}
class C {
    void autoPlay(I i){
        i.play();
    }
}
class D implements I {
    @Override
    public void play(){
        System.out.println("play in D class");
    }
}
class E implements I{
    @Override
    public void play(){
        System.out.println("play in E class");
    }
}

public class InterfaceTest2 {
    public static void main(String args[]){
        C c = new C();
        c.autoPlay(new D());
        c.autoPlay(new E());
    }
}
