package Ch07;

/**
 * Created by Sang Jun Park on 5/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Tv {
    boolean power;
    int channel;

    void power(){

    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text){
        if(caption)
            System.out.println(text);
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World!");
        ctv.caption = true;
        ctv.displayCaption("Hello, World!2");

    }
}
