package Ch7;

/**
 * Created by Sang Jun Park on 5/29/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv2 extends Product2{
    Tv2(){
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}
class Computer2 extends Product2{
    Computer2(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio2 extends Product2{
    Audio2(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("Not enough budget for " + p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("You bought " + p);
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++){
            if(item[i] == null)
                break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }

        System.out.println("The total you spend " + sum);
        System.out.println("Products are " + itemList);

    }

}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());

        b.summary();

    }
}
