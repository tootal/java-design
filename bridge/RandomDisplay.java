package bridge;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times) {
        open();
        Random random = new Random();
        int n = random.nextInt(times);
        for (int i = 0; i < n; i++) {
            print();
        }
        close();
    }
}
