package OOP_BOOK;

public abstract class TextBook extends Book {

    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject + ", Final Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.10;
    }
}
