package Ch6;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        //Data2 d2 = new Data2();               //Already defined a constructor, compiler will not create default constructor
    }
}
