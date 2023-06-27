package Ch07;

/**
 * Created by Sang Jun Park on 5/31/2023.
 * Github : http://github.com/SangJun-GitHub
 */
interface J{
    public abstract void method();
}
class InstanceManager{
    public static J getInstance(){
        return new G();
    }
}
class F{
    void methodF(){
        J j = InstanceManager.getInstance();
        j.method();
        System.out.println(j.toString());
    }
}
class G implements J{
    public void method(){
        System.out.println("methodG in G class");
    }
    public String toString(){
        return "class G";
    }
}
public class InterfaceTest3 {
    public static void main(String[] args) {
        F f = new F();
        f.methodF();
    }
}
