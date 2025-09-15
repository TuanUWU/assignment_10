package OOP_BOOK;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BookList bookList = new BookList();
            int choice;

            do {
                System.out.println("\n1. Add TextBook\n2. Add ReferenceBook\n3. Update Book\n4. Delete Book\n5. Find Book\n6. Display All\n7. Most Expensive\n8. Count Books\n0. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("ID: ");
                        String id1 = sc.nextLine();
                        System.out.print("Title: ");
                        String title1 = sc.nextLine();
                        System.out.print("Price: ");
                        double price1 = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Subject: ");
                        String subject = sc.nextLine();
                        bookList.addBook(new TextBook(id1, title1, price1, subject) {
                        });
                    }
                    case 2 -> {
                        System.out.print("ID: ");
                        String id2 = sc.nextLine();
                        System.out.print("Title: ");
                        String title2 = sc.nextLine();
                        System.out.print("Price: ");
                        double price2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Publisher: ");
                        String publisher = sc.nextLine();
                        bookList.addBook(new ReferenceBook(id2, title2, price2, publisher) {
                        });
                    }
                    case 3 -> {
                        System.out.print("Enter ID to update: ");
                        System.out.println(bookList.updateBookById(sc.nextLine()) ? "Updated" : "Not found");
                    }
                    case 4 -> {
                        System.out.print("Enter ID to delete: ");
                        System.out.println(bookList.deleteBookById(sc.nextLine()) ? "Deleted" : "Not found");
                    }
                    case 5 -> {
                        System.out.print("Enter ID to find: ");
                        Book found = bookList.findBookById(sc.nextLine());
                        if (found != null) {
                            found.displayDetails();
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    case 6 ->
                        bookList.displayAllBooks();
                    case 7 -> {
                        Book expensive = bookList.findMostExpensiveBook();
                        if (expensive != null) {
                            System.out.println("Most Expensive Book:");
                            expensive.displayDetails();
                        }
                    }
                    case 8 ->
                        bookList.countBooks();
                }
            } while (choice != 0);
        }
    }
}
