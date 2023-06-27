package Ch12.Generics;

import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 6/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Fruit{
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}
class Toy{
    public String toString(){
        return "Toy";
    }
}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy>   toyBox = new Box<Toy>();
        //Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());      //void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy());      //Box<Apple> can not contain Toy

        toyBox.add(new Toy());
        //toyBox.add(new Apple());      //Box<Toy> con not contain Apple

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

    }
}
