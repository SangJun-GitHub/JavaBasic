package Ch12;

/**
 * Created by Sang Jun Park on 6/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
enum Direction2{
    EAST(3, "▷"), SOUTH(6, "▽"), WEST(9,"◁"), NORTH(12, "△");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol){
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue(){
        return value;
    }
    public String getSymbol(){
        return symbol;
    }

    public static Direction2 of(int dir){
        if(dir < 1 || dir > 12 )
            throw new IllegalArgumentException("Invalid value : " + dir);
        return DIR_ARR[(dir/3) - 1];
    }
    public Direction2 rotate(int num){
        num  = num % 4 ;
        if(num == 0)
            return DIR_ARR[value%3];
        else if(num < 0)
            num += 4;

        return DIR_ARR[(((value%3) - 1 ) + num) + 1];
    }
    public String toString(){
        return name() + getSymbol();
    }
}
public class EnumEx2 {
    public static void main(String[] args) {
        for(Direction2 d : Direction2.values()){
            System.out.printf("%-8s = %d\n", d.name(), d.getValue());
        }
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(6);

        System.out.printf("d1 = %-5s, %d\n", d1.name(), d1.getValue());
        System.out.printf("d2 = %-5s, %d\n", d2.name(), d2.getValue());


        System.out.println("Direction2.EAST.rotate(0) " + Direction2.EAST.rotate(0));
        System.out.println("Direction2.EAST.rotate(1) " + Direction2.EAST.rotate(1));
        System.out.println("Direction2.EAST.rotate(2) " + Direction2.EAST.rotate(2));
        System.out.println("Direction2.EAST.rotate(-1) " + Direction2.EAST.rotate(-1));
        System.out.println("Direction2.EAST.rotate(-2) " + Direction2.EAST.rotate(-2));
    }
}
