package Ch13;

/**
 * Created by Sang Jun Park on 7/4/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class ThreadEx22 {
    public static void main(String[] args) {
        RunnableEx22 r = new RunnableEx22();

        new Thread(r).start();
        new Thread(r).start();
    }
}
class Account2{
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }
    public synchronized void withdraw(int money){
        //synchronized (this){
        if(balance >= money){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            balance -= money;
        }
        //}
    }
}
class RunnableEx22 implements Runnable{
    Account2 acc = new Account2();

    @Override
    public void run(){
        while(acc.getBalance() > 0){
            int money = (int)(Math.random() * 3 + 1 ) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}
