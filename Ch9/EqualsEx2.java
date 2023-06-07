package Ch9;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Person{
    long id;

    public boolean equals(Object obj){
        if(obj != null && obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }

    Person(long id){
        this.id = id;
    }
}
public class EqualsEx2 {
    public static void main(String[] args){
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1.equals(p2) : " + p1.equals(p2));

    }
}
