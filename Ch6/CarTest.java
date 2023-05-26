package Ch6;

/**
 * Created by Sang Jun Park on 5/8/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Car{
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String color){
        this(color, "auto", 4);
                                                //For calling other constructor, follow below rules
                                                //Use this(), instead of class name
                                                //It MUST be placed on first line of the constructor
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c){
        this(c.color, c.gearType, c.door);
    }

    @Override
    public String toString(){
        return " color = " + this.color + ", gearType = " + this.gearType + ", door = " + this.door;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "manual";
        c1.door = 2;

        Car c2 = new Car("Red", "auto", 4);
        Car c3 = new Car("Blue");

        //Copy variables from c3 to c4
        Car c4 = new Car(c3);


        System.out.println("c1" + c1);
        System.out.println("c2" + c2);
        System.out.println("c3" + c3);
        System.out.println("c4" + c4);
    }
}
