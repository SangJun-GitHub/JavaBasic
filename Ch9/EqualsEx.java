package Ch9;



/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);


        System.out.println("v1.equals(v2) : " + v1.equals(v2) );

        System.out.println("v2 = v1");
        v2 = v1;

        System.out.println("v1.equals(v2) : " + v1.equals(v2) );

    }
}
