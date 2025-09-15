package OOP_BOOK;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.20;
    }

    @Override
    public void displayDetails() {
        System.out.println("ReferenceBook ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + calculatePrice());
    }
}
