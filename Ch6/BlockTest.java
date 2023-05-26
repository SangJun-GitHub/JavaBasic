package Ch6;

/**
 * Created by Sang Jun Park on 5/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class BlockTest {
    static {
        System.out.println("static { }");       //Class initialization block
    }

    {
        System.out.println("{ }");              //Instance initialization block
    }
    public BlockTest(){
        System.out.println("Constructor");      //Constructor
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }

}
