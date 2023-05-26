package Ch7;

/**
 * Created by Sang Jun Park on 5/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("Drive, Brrrr~");
    }

    void stop(){
        System.out.println("Stop!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("Water!!");
    }
}
public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe1 = new FireEngine();
        FireEngine fe2 = null;

        fe1.water();
        car = fe1;                      // car = (Car)fe1
        //car.water();                  // Error because the instance car is Car type instance does not have water method
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
