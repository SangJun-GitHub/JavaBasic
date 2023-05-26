package Ch6;

import javax.xml.crypto.Data;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */

class DataSample{
    int x;
}
public class PrimitiveParamEx {
    public static void main(String[] args) {
        DataSample d = new DataSample();
        d.x = 10;
        System.out.println("main() : x = " + d.x);          //10

        change(d.x);
        System.out.println("After changed(d.x)");
        System.out.println("main() : x = " + d.x);          //10
    }

    static void change(int x){
        x = 100;
        System.out.println("change() : x = " + x);          //100
    }


}
