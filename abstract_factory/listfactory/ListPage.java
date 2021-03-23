package abstract_factory.listfactory;

import java.util.Iterator;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><body><h1>\n" + title + "\n</h1>\n<ul>");
        Iterator<Item> it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n<hr><address>" + author + "</address></body></html>");
        return buffer.toString();
    }
}
