package Ch12;

/**
 * Created by Sang Jun Park on 6/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
enum Transportation{
    BUS(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRLINE(300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE;

    Transportation(int basicFare){
        BASIC_FARE = basicFare;
    }
    public int getBasicFare(){
        return BASIC_FARE;
    }
    abstract int fare(int distance);
}
public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus     fare    = " + Transportation.BUS.fare(100));
        System.out.println("train   fare    = " + Transportation.TRAIN.fare(100));
        System.out.println("ship    fare    = " + Transportation.SHIP.fare(100));
        System.out.println("airline fare    = " + Transportation.AIRLINE.fare(100));
    }
}
