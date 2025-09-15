package OOP_BOOK;

public abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void addBook(Book book) {
    }

    public boolean updateBookById(String id) {
        return false;
    }


    public void displayDetails() {
        System.out.println("ID: " + id + ", Title: " + title + ", Base Price: " + basePrice);
    }


    public abstract double calculatePrice();
}
