public class StoryBook extends Book {
    String category;

    public StoryBook() {
        
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String c){ this.category = c; }
    public String getCategory(){ return category; }

    void showDetails() {
        System.out.println("Story Book");
        System.out.println("\n Title: " + bookTitle + " \n Category: " + category);
        System.out.println("\n ISBN: " + isbn + "\n Price: " + price + "\n Qty: " + availableQuantity);
    }
}