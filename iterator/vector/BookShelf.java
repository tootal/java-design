package iterator.vector;

import java.util.Vector;
import iterator.*;

public class BookShelf implements Aggregate {
    private Vector<Book> books;
    public BookShelf(int maxsize) {
        books = new Vector<Book>();
    }
    public Book getBookAt(int index) {
        return books.elementAt(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
