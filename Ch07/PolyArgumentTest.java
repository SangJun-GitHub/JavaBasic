package Ch07;

/**
 * Created by Sang Jun Park on 5/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv1 extends Product{
    Tv1() {
        super(100);
    }

    public String toString(){
        return "TV";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("Not enough budget for " + p);
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You bought " + p);
    }
    void check(){
        System.out.println("Your budget is "+ money);
        System.out.println("Your bonus point is " + bonusPoint);
        System.out.println();
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.check();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.check();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.check();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.check();

        Object o = new Object();
        System.out.print(o);


    }
}
