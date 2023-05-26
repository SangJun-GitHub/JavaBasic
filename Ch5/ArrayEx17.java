package Ch5;

/**
 * Created by Sang Jun Park on 5/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ArrayEx17 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("usage: java ArrayEx17 MUN1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':                           //because of wildcard you should type like "java ArrayEx17.java 10 x 2"
                result = num1 * num2;
                break;
            case '/':                           //because of wildcard you should type like "java ArrayEx17.java 10 // 2"

                result = num1 / num2;
                break;
            default:
                System.out.println("You Enter wrong OP");
        }
        System.out.println("Result : " + result);
    }
}
