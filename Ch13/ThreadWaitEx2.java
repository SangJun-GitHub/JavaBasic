package Ch13;

import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 7/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadWaitEx2 {
    public static void main(String[] args) throws Exception {
        Table2 table = new Table2();

        new Thread(new Cook2(table),"COOK1").start();
        new Thread(new Customer2(table, "donut"), "CUSTOMER1").start();
        new Thread(new Customer2(table, "burger"), "CUSTOMER2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
enum Menu2{
    DONUT(0,"donut"), BURGER(1, "burger");

    private final int value;
    private final String name;
    Menu2(int value, String name){
        this.value = value;
        this.name = name;
    }
}
class Table2{
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        if(dishes.size() >= MAX_FOOD){
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    public boolean remove(String dishName){
        synchronized (this){
            while(dishes.size() == 0){
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){}
            }
            for(int i = 0; i < dishes.size(); i++){
                if(dishName.equals(dishes.get(i))){
                    dishes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public int dishNum(){
        return dishNames.length;
    }
}
class Cook2 implements Runnable{
    private Table2 table;

    Cook2(Table2 table){
        this.table = table;
    }

    @Override
    public void run(){
        while(true){
            //table.add(((int)(Math.random() * 2) == Menu.BURGER.getValue() ? Menu.BURGER.getName() : Menu.DONUT.getName()));
            int index = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[index]);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
        }
    }
}
class Customer2 implements Runnable{
    private Table2 table;
    private String food;

    Customer2(Table2 table, String food){
        this.table = table;
        this.food = food;
    }

    @Override
    public void run(){
        while(true){
            try{
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
