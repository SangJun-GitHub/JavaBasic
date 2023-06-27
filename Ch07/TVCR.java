package Ch07;

/**
 * Created by Sang Jun Park on 5/10/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class VCR{
    boolean power;
    int counter = 0;
    void power(){
        power = !power;
    }
    void play(){}
    void stop(){}
    void rew(){}
    void ff(){}
}
public class TVCR extends Tv {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }
}
