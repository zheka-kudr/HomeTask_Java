package op.task9;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Book book1 = new Book(1, "Java", "Popov", "Minsk izdatelstvo", 2015, 289, 44, "hard");
        Book book2 = new Book(2, "С++", "Igorev", "Grodno izdatelstvo", 2014, 523, 62, "hard");
        Book book3 = new Book(3, "Javascript", "Popov", "Minsk izdatelstvo", 2018, 128, 28, "soft");
        Book book4 = new Book(4, "Python", "Malahov", "Brest izdatelstvo", 2019, 356, 46, "hard");
        Book book5 = new Book(5, "Java", "Nemcov", "Vitebsk izdatelstvo", 2013, 204, 72, "soft");
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        bookList.addBook(book5);

        BookListLogic bookListLogic = new BookListLogic();
        bookListLogic.getBooksByAuthor(bookList, "Popov");
        System.out.println();
        bookListLogic.getBooksByPublishingOffice(bookList, "Minsk izdatelstvo");
        System.out.println();
        bookListLogic.getBooksAfterYear(bookList, 2017);
    }
}
