package op.task9;

import java.util.List;
import java.util.stream.Collectors;

class BookListLogic {
    void getBooksByAuthor(BookList bookList, String author) {
        List<Book> books;
        books = bookList.getBooks();
        if (!books.isEmpty()) {
            List<Book> result = books.stream().filter(book -> author.equals(book.getAuthor())).collect(Collectors.toList());
            result.forEach(System.out::println);
        } else {
            System.out.println("Booklist is empty");
        }
    }

    void getBooksByPublishingOffice(BookList bookList, String office) {
        List<Book> books;
        books = bookList.getBooks();
        if (!books.isEmpty()) {
            List<Book> result = books.stream().filter(book -> office.equals(book.getPublishingOffice())).collect(Collectors.toList());
            result.forEach(System.out::println);
        } else {
            System.out.println("Booklist is empty");
        }
    }

    void getBooksAfterYear(BookList bookList, int year) {
        List<Book> books;
        books = bookList.getBooks();
        if (!books.isEmpty()) {
            List<Book> result = books.stream().filter(book -> book.getYear() >= year).collect(Collectors.toList());
            result.forEach(System.out::println);
        } else {
            System.out.println("Booklist is empty");
        }
    }
}
