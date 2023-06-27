package Ch07;

import java.util.Vector;

/**
 * Created by Sang Jun Park on 5/29/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Product3{
    int price;
    int bonusPoint;

    Product3(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product3(){
        price = 0;
        bonusPoint = 0;
    }
}
class Tv3 extends Product3{
    Tv3(){
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}
class Computer3 extends Product3{
    Computer3(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio3 extends Product3{
    Audio3(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer3{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();


    void buy(Product3 p){
        if(money < p.price){
            System.out.println("Not enough budget for " + p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("You bought " + p);
    }

    void refund(Product3 p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " refunded");
        } else{
            System.out.println("you did not buy " + p);
        }
    }

    void summary(){
        int sum = 0;
        String itemList = "";
        if(item.isEmpty()){
            System.out.println("Your did not buy any product");
            return;
        }
        for (int i = 0; i < item.size(); i++){
            Product3 p = (Product3) item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }

        System.out.println("The total you spend " + sum);
        System.out.println("Products are " + itemList);

    }

}
public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b= new Buyer3();
        Tv3 tv = new Tv3();
        Computer3 computer = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv);
        b.buy(computer);
        b.buy(computer);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);
        b.buy(audio);

        System.out.println();
        b.summary();

        System.out.println();
        b.refund(tv);
        b.refund(tv);

        System.out.println();
        b.summary();


    }
}
