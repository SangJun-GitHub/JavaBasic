package Ch12.Generics;


import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 6/26/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Fruit3{
    public String toString(){
        return "Fruit3";
    }
}
class Apple3 extends Fruit3{
    public String toString(){
        return "Apple3";
    }
}
class Grape3 extends Fruit3{
    public String toString(){
        return "Grape3";
    }
}
class Juice{
    String name;
    Juice(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
class Juicer{
    static Juice makeJuice(FruitBox3<? extends Fruit3> fruitBox3){
        String tmp = "";

        for(Fruit3 f : fruitBox3.list){
            tmp += f + " ";
        }
        tmp += " Juice";
        return new Juice(tmp);
    }
}
class FruitBox3<T extends Fruit3> extends Box3<T>{}
class Box3<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    public String toString(){
        return list.toString();
    }
}
public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox3 = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> appleBox3 = new FruitBox3<Apple3>();

        fruitBox3.add(new Apple3());
        fruitBox3.add(new Grape3());

        appleBox3.add(new Apple3());
        appleBox3.add(new Apple3());

        System.out.println(Juicer.makeJuice(fruitBox3));
        System.out.println(Juicer.makeJuice(appleBox3));
    }
}
