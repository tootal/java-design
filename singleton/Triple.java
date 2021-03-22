package singleton;

public class Triple {
    private static Triple[] inst = new Triple[] {
        new Triple(),
        new Triple(),
        new Triple()
    };
    public static Triple getInstance(int id) {
        if (id >= 0 && id <= 2) return inst[id];
        else return null;
    }
    private Triple() {
        System.out.println("创建了一个Triple实例");
    }
    public void use() {
        System.out.println("使用了一个Triple实例");
    }
    public static void main(String[] args) {
        Triple t0 = Triple.getInstance(0);
        Triple t1 = Triple.getInstance(1);
        Triple t2 = Triple.getInstance(2);
        t0.use();
        t1.use();
        t2.use();
    }
}
