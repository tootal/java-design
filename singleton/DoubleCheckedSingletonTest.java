package singleton;

public class DoubleCheckedSingletonTest extends Thread {
    @Override
    public void run() {
        DoubleCheckedSingleton fs = DoubleCheckedSingleton.getInst();
        System.out.println(fs);
    }
    public static void main(String[] args) {
        new DoubleCheckedSingletonTest().start();
        new DoubleCheckedSingletonTest().start();
        new DoubleCheckedSingletonTest().start();
    }
}
