package singleton;

public class FakeSingletonTest extends Thread {
    @Override
    public void run() {
        FakeSingleton fs = FakeSingleton.getInst();
        System.out.println(fs);
    }
    public static void main(String[] args) {
        new FakeSingletonTest().start();
        new FakeSingletonTest().start();
        new FakeSingletonTest().start();
    }
}
