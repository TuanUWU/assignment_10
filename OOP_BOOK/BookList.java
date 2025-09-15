package OOP_BOOK;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id, Book updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(id)) {
                bookList.set(i, updatedBook);
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
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : bookList) {
                book.displayDetails();
                System.out.println("-----");
            }
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book maxBook = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > maxBook.calculatePrice()) {
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
        System.out.println("TextBooks: " + textCount);
        System.out.println("ReferenceBooks: " + refCount);
    }
}
