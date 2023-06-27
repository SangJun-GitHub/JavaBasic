package Ch06;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceParamEx {
    public static void main(String[] args) {
        DataSample d = new DataSample();

        d.x = 10;
        System.out.println("main() : x = " + d.x);          //10

        change(d);
        System.out.println("After changed(d)");
        System.out.println("main() : x = " + d.x);          //100
    }
    static void change(DataSample d){
        d.x = 100;
        System.out.println("change() : x = " + d.x);          //100
    }
}
