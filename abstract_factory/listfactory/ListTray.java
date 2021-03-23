package abstract_factory.listfactory;

import java.util.Iterator;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n" + caption + "\n<ul>\n");
        Iterator<Item> it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n</li>\n");
        return buffer.toString();
    }
}
