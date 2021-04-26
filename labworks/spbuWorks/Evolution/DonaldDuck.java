package spbuWorks.Evolution;

public class DonaldDuck extends Fish implements Runnable{
    @Override
    public void swim() {
        System.out.println("Crya crya I swim liky fish");
    }

    @Override
    public void run() {
        System.out.println("Duck forever can fly!"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        DonaldDuck dd=new DonaldDuck();
        new Thread(dd).start();
        new Thread(dd).start();
        new Thread(dd).start();
        new Thread(dd).start();
        new Thread(dd).start();
        new Thread(dd).start();
    }
}
