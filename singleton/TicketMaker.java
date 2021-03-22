package singleton;

public class TicketMaker {
    private int ticket = 1000;
    public int getNextTicketNumber() {
        return ticket++;
    }
    public static void main(String[] args) {
        TicketMaker maker = new TicketMaker();
        for (int i = 0; i < 5; i++) {
            int num = maker.getNextTicketNumber();
            System.out.println(num);
        }
    }
}
