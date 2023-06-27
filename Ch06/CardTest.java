package Ch06;

/**
 * Created by Sang Jun Park on 5/3/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Card{
    String shape;
    int number;
    static int width = 100;
    static int height = 250;

    @Override
    public String toString(){
        return "Shape: " + shape + " Number: " + number + " Width: " + width + " height: " + height;
    }
}
public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width  = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.shape = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.shape = "Spade";
        c2.number = 4;

        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);

        System.out.println("Change width and height");
        Card.width = 50;
        Card.height = 80;

        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);

    }
}
