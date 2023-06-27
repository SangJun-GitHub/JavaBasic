package Ch07;

/**
 * Created by Sang Jun Park on 5/25/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class CastingTest2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = null;
        FireEngine fe1 = null;

        car1.drive();
        //fe1 = (FireEngine)car1;           //Error because car1 is Car type instance.
        //fe1.water();

        Car car3 = new FireEngine();
        fe1 = (FireEngine)car3;
        car2 = fe1;
        car2.drive();
    }
}
