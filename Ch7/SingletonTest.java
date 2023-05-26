package Ch7;

/**
 * Created by Sang Jun Park on 5/16/2023.
 * Github : http://github.com/SangJun-GitHub
 */
final class Singleton{
    private static Singleton s = new Singleton();
    private Singleton(){
        //...
    }
    public static Singleton getInstance(){
        if(s==null)
            s = new Singleton();
        return s;
    }

}
public class SingletonTest {
    public static void main(String[] args){
        //Singleton s = new Singleton();              //Error! Singletons() is private constructor
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 +" and " + s2);
    }
}
