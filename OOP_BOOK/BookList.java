package OOP_BOOK;


import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                book.setTitle(book.getTitle() + " (Updated)");
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(book -> book.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println("-----");
        }
    }

    public Book findMostExpensiveBook() {
        Book maxBook = null;
        double maxPrice = 0;
        for (Book book : bookList) {
            double price = book.calculatePrice();
            if (price > maxPrice) {
                maxPrice = price;
                maxBook = book;
            }
        }
        return maxBook;
    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                textCount++;
            } else if (book instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("TextBooks: " + textCount + ", ReferenceBooks: " + refCount);
    }
}

