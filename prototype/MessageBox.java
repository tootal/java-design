package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    private void printLine(int len) {
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    public void use(String s) {
        int length = s.getBytes().length;
        printLine(length);
        System.out.println(decochar + " " + s + " " + decochar);
        printLine(length);
    }
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
