package OOP_BOOK;

public abstract class ReferenceBook extends Book {

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
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher: " + publisher + ", Final Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.20;
    }
}
