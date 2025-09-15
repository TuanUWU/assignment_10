package OOP_BOOK;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\n--- Book Management Menu ---");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by ID");
            System.out.println("4. Delete book by ID");
            System.out.println("5. Find book by ID");
            System.out.println("6. Display all books");
            System.out.println("7. Find most expensive book");
            System.out.println("8. Count books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Base Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Subject: ");
                    String subject = sc.nextLine();
                    bookList.addBook(new TextBook(id, title, price, subject));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Base Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Publisher: ");
                    String publisher = sc.nextLine();
                    bookList.addBook(new ReferenceBook(id, title, price, publisher));
                }
                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    String id = sc.nextLine();
                    System.out.print("New Title: ");
                    String title = sc.nextLine();
                    System.out.print("New Base Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Type (1-TextBook, 2-ReferenceBook): ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    Book updatedBook;
                    if (type == 1) {
                        System.out.print("New Subject: ");
                        String subject = sc.nextLine();
                        updatedBook = new TextBook(id, title, price, subject);
                    } else {
                        System.out.print("New Publisher: ");
                        String publisher = sc.nextLine();
                        updatedBook = new ReferenceBook(id, title, price, publisher);
                    }
                    boolean success = bookList.updateBookById(id, updatedBook);
                    System.out.println(success ? "Updated successfully." : "Book not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    String id = sc.nextLine();
                    boolean success = bookList.deleteBookById(id);
                    System.out.println(success ? "Deleted successfully." : "Book not found.");
                }
                case 5 -> {
                    System.out.print("Enter ID to find: ");
                    String id = sc.nextLine();
                    Book book = bookList.findBookById(id);
                    if (book != null) {
                        book.displayDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                case 6 ->
                    bookList.displayAllBooks();
                case 7 -> {
                    Book book = bookList.findMostExpensiveBook();
                    if (book != null) {
                        System.out.println("Most expensive book:");
                        book.displayDetails();
                    } else {
                        System.out.println("No books available.");
                    }
                }
                case 8 ->
                    bookList.countBooks();
                case 0 ->
                    System.out.println("Exiting program.");
                default ->
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
