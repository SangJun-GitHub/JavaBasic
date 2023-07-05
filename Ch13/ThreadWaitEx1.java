package Ch13;


import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 7/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */

public class ThreadWaitEx1 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();      //shared object to many threads

        new Thread(new Cook(table), "Cook1").start();
        new Thread(new Customer(table, "donut"), "Customer1").start();
        new Thread(new Customer(table, "donut"), "Customer2").start();
        new Thread(new Customer(table, "donut"), "Customer3").start();
        new Thread(new Customer(table, "burger"), "Customer4").start();

        Thread.sleep(100);
        System.exit(0);
    }
}
enum Menu{DONUT(0, "donut"), BURGER(1,"burger");
    private final int value;
    private final String name;
    Menu(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
}
class Table{
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish){
        if(dishes.size() >= MAX_FOOD)
            return;

        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }
    public boolean remove(String dishName){
        for(int i = 0; i < dishes.size(); i++){
            if(dishName.equals(dishes.get(i))){
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }
    public int dishNum(){
        return dishNames.length;
    }
}
class Customer implements Runnable{
    private Table table;
    private String food;

    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){}

            String name = Thread.currentThread().getName();

            if(eatFood())
                System.out.println(name + " ate a " + food);
            else
                System.out.println(name + " failed to eat. :(");
        }
    }
    public boolean eatFood(){
        return table.remove(food);
    }
}
class Cook implements Runnable{
    private Table table;

    Cook(Table table){
        this.table = table;
    }

    @Override
    public void run(){
        while(true){
            table.add(((int)(Math.random() * 2) == Menu.BURGER.getValue() ? Menu.BURGER.getName() : Menu.DONUT.getName()));

            try {
                Thread.sleep(1);
            }catch (InterruptedException e){}
        }
    }
}
