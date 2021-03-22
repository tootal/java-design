package singleton;

public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton inst = null;
    public static DoubleCheckedSingleton getInst() {
        if (inst == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (inst == null) {
                    inst = new DoubleCheckedSingleton();
                }
            }
        }
        return inst;
    }
    private DoubleCheckedSingleton() {}
}
