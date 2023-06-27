package Ch12;

/**
 * Created by Sang Jun Park on 6/27/2023.
 * Github : http://github.com/SangJun-GitHub
 */
abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>{
    static int id = 0;
    private int ordinal;
    protected String name = "";

    public int getOrdinal(){
        return ordinal;
    }
    MyEnum(String name){
        this.name = name;
        ordinal = id++;
    }
    public int compareTo(T t){
        return ordinal - t.getOrdinal();
    }
}
abstract class MyTransportation extends MyEnum{
    static final MyTransportation BUS = new MyTransportation("BUS", 100){
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 150){
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation SHIP = new MyTransportation("SHIP", 100){
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation AIRLINE = new MyTransportation("AIRLINE", 300){
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    abstract int fare(int distance);
    protected final int BASIC_FARE;

    MyTransportation(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return getName();
    }
}
public class EnumEx4 {
    public static void main(String[] args) {
        MyTransportation t1 = MyTransportation.BUS;
        MyTransportation t2 = MyTransportation.BUS;
        MyTransportation t3 = MyTransportation.TRAIN;
        MyTransportation t4 = MyTransportation.SHIP;
        MyTransportation t5 = MyTransportation.AIRLINE;

        System.out.printf("t1 = %-8s, %d\n", t1.getName(), t1.getOrdinal());
        System.out.printf("t2 = %-8s, %d\n", t2.getName(), t2.getOrdinal());
        System.out.printf("t3 = %-8s, %d\n", t3.getName(), t3.getOrdinal());
        System.out.printf("t4 = %-8s, %d\n", t4.getName(), t4.getOrdinal());
        System.out.printf("t5 = %-8s, %d\n", t5.getName(), t5.getOrdinal());

        System.out.println("t1 == t2            : " + (t1 == t2));
        System.out.println("t1.compareTo(t3)    : " + t1.compareTo(t3));


    }
}
