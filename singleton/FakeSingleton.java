package singleton;

public class FakeSingleton {
    private static FakeSingleton inst = null;
    public static synchronized FakeSingleton getInst() {
        if (inst == null) {
            inst = new FakeSingleton();
        }
        return inst;
    }
    private FakeSingleton() {
        System.out.println("生成了一个实例");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
