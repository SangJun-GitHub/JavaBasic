package Ch6;

/**
 * Created by Sang Jun Park on 5/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceReturnEx {
    public static void main(String[] args) {
        DataSample d = new DataSample();
        d.x = 10;

        DataSample d2 = new DataSample();
        d2 = copy(d);
        System.out.println("d.x  = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }
    static DataSample copy(DataSample from){
        DataSample tmp = new DataSample();
        tmp.x = from.x;;
        return tmp;
    }
}
