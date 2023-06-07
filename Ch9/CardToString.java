package Ch9;

/**
 * Created by Sang Jun Park on 6/6/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Card{
    String kind;
    int number;

    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());          //toString() from Object class because did not override toString()
        System.out.println(c2);
    }
}
