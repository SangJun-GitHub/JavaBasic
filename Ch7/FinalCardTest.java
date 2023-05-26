package Ch7;

/**
 * Created by Sang Jun Park on 5/16/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class FinalCard{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    FinalCard(int number, String kind){
        NUMBER = number;
        KIND = kind;
    }
    FinalCard(){
        this(1, "HEART");
    }
    public String toString(){
        return KIND + " " + NUMBER;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        FinalCard fc = new FinalCard(10,"HEART");
        //fc.NUMBER = 5;                                        //error because of final
        System.out.println(fc.KIND);
        System.out.println(fc.NUMBER);
        System.out.println(fc);
    }
}
