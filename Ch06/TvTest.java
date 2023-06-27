package Ch06;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Tv{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
        if (power)
            System.out.println("Power On");
        else
            System.out.println("Power Off");
    }
    void channelUp(){
        channel++;
        System.out.printf("Now your channel is %d\n", channel);
    }
    void channelDown(){
        channel--;
        System.out.printf("Now your channel is %d\n", channel);
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.color = "Black";
        t.channel = 0;
        t.power = false;

        System.out.printf("Tv color is %s\n", t.color);
        t.power();

        System.out.println("channel up 10 times");
        for(int i =0; i < 10; i++)
            t.channelUp();

        System.out.println("channel down 5 times");
        for(int i =0; i < 5; i++)
            t.channelDown();

        t.power();

    }
}
