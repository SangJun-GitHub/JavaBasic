package Ch11.Iterator.Collection.List;

import java.util.Stack;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StackEx1 {
    public static Stack back    = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.google");
        goURL("2.facebook");
        goURL("3.netflix");
        goURL("4.youtube");

        printStatus();

        goBack();
        System.out.println("==      After back      ==");
        printStatus();

        goBack();
        System.out.println("==      After back      ==");
        printStatus();

        goForward();
        System.out.println("==      After forward   ==");
        printStatus();

        goURL("github");
        System.out.println("==      New URL         ==");
        printStatus();

    }
    public static void printStatus(){
        System.out.println("Back    :" + back);
        System.out.println("Forward :" + forward);
        System.out.println("Current :" + back.peek());
        System.out.println();
    }
    public static void goURL(String url){
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }
    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack(){
        if(!back.empty())
            forward.push(back.pop());
    }
}
