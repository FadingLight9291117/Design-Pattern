package iterator;


public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("book1"))
                .appendBook(new Book("book2"))
                .appendBook(new Book("book3"))
                .appendBook(new Book("book4"))
                .appendBook(new Book("book5"));
        Iterator iter = bookShelf.iterator();
        while (iter.hasNext()) {
            Book book = (Book) iter.next();
            System.out.println(book.getName());
        }
    }
}
