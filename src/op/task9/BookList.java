package op.task9;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books;

    BookList() {
        this.books = new ArrayList<>();
    }

    List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    void addBook(Book book) {
        this.books.add(book);
    }
}
