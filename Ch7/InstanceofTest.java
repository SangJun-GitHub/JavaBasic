package Ch7;

/**
 * Created by Sang Jun Park on 5/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe1 = new FireEngine();

        if(fe1 instanceof FireEngine)
            System.out.println("This is a FireEngine instance");

        if(fe1 instanceof Car)
            System.out.println("This is a Car instance");


        if(fe1 instanceof Object)
            System.out.println("This is a Object instance");

        System.out.println(fe1.getClass().getName());

    }
}
