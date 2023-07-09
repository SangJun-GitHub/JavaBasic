package Ch14;

/**
 * Created by Sang Jun Park on 7/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */

@FunctionalInterface
interface MyFunction2{
    void myMethod();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {};                                           //MyFunction f = (MyFunction) (()->{});
        Object obj = (MyFunction2)(()->{});                                 //Object obj = (Object)(MyFunction2)(()->{});
        String str = ((Object)(MyFunction2)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        //System.out.println(()->{});                                        //Error. Lambda expression cannot convert as Object
        System.out.println((MyFunction2)(()->{}));
        //System.out.println((MyFunction2)(()->{}).toString());
        System.out.println(((Object)(MyFunction2)(()->{})).toString());

    }
}
