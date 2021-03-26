package memento.game;

// import java.util.ArrayList;
import java.util.Random;

public class Gamer {
    private int money;
    // private ArrayList<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    // private static String[] fruitsname = {
        // "苹果", "葡萄", "香蕉", "橘子",
    // };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半了。");
        } else if (dice == 6) {
        }

    }
}
