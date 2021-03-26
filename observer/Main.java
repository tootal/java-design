package observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator gen = new RandomNumberGenerator();
        Observer ob1 = new DigitObserver();
        Observer ob2 = new GraphObserver();
        gen.addObserver(ob1);
        gen.addObserver(ob2);
        gen.execute();
    }
}
