package Ch7;

/**
 * Created by Sang Jun Park on 5/30/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Unit{
    int currentHP;
    int x;
    int y;
}
class Fighter extends Unit implements Fightable{
    public void move(int x, int y){};
    public void attack(Unit u){};
}
interface Fightable extends Movable, Attackable {};
interface Movable{
    public abstract void move(int x, int y);
}
interface Attackable {
    void attack(Unit u);
}
public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();

        if(fighter instanceof Unit)
            System.out.println("fighter is a child of Unit class");

        if(fighter instanceof Fightable)
            System.out.println("fighter implement Fightable interface");

        if(fighter instanceof Movable)
            System.out.println("fighter implement Movable interface");

        if(fighter instanceof Attackable)
            System.out.println("fighter implement Attackable interface");

        if(fighter instanceof Object)
            System.out.println("fighter is a child of Object class");
    }
}
