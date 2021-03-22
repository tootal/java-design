package singleton;

public class SingletonTicketMaker {
    private static SingletonTicketMaker maker = new SingletonTicketMaker();
    private int ticket = 1000;
    private SingletonTicketMaker() {}
    public static SingletonTicketMaker getInstance() {
        return maker;
    }
    public int getNextTicketNumber() {
        return ticket++;
    }
    public static void main(String[] args) {
        SingletonTicketMaker maker = SingletonTicketMaker.getInstance();
        for (int i = 0; i < 5; i++) {
            int num = maker.getNextTicketNumber();
            System.out.println(num);
        }
    }
}
