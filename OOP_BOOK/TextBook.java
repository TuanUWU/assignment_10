package OOP_BOOK;

public class TextBook extends Book {

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
    public double calculatePrice() {
        return getBasePrice() * 1.10;
    }

    @Override
    public void displayDetails() {
        System.out.println("TextBook ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Subject: " + subject);
        System.out.println("Price: " + calculatePrice());
    }
}
