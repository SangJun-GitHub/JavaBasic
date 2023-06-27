package Ch06;

/**
 * Created by Sang Jun Park on 5/9/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Product{
    static int count = 0;
    int serialNo;

    {
     ++count;
     serialNo = count;
    }

    public Product(){}
}
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1 serial number is " + p1.serialNo);           //1
        System.out.println("p2 serial number is " + p2.serialNo);           //2
        System.out.println("p3 serial number is " + p3.serialNo);           //3

        System.out.println("Total amount of products is " + Product.count); //3
    }
}
