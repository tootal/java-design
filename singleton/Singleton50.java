package singleton;

public class Singleton50 {
    private static Singleton50[] inst = new Singleton50[50];
    static {
        for (int i = 0; i < 50; i++) {
            inst[i] = new Singleton50(i);
        }
    }
    public static Singleton50 getInst(int id) {
        if (id >= 0 && id < 50) return inst[id];
        return null;
    }
    private int id;
    private Singleton50(int id) {
        this.id = id;
    }
    public void use() {
        System.out.println("使用了id为" + id + "的实例");
    }
    public static void main(String[] args) {
        Singleton50 x = Singleton50.getInst(20);
        x.use();
    }
}
