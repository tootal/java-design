package builder;

public class Main {
    public static void make(String type) {
        Builder builder = null;
        if (type.equals("markdown")) {
            builder = new TextBuilder();
        } else if (type.equals("html")) {
            builder = new HTMLBuilder();
        }
        Director director = new Director(builder);
        director.construct();
        String result = builder.getResult();
        System.out.println(result);
    }
    public static void main(String[] args) {
        make("markdown");
        make("html");
    }
}
