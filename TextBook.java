public class TextBook extends Book {
    int standard;

    public TextBook() {

    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int s){ 
        this.standard = s; 
    }
    public int getStandard(){ 
        return standard; 
    }

    void showDetails() {
        System.out.println("Text Book");
        System.out.println("\n Title: " + bookTitle + " \n Standard: " + standard);
        System.out.println("\n ISBN: " + isbn + " \n Price: " + price + " \n Quantutity: " + availableQuantity);
    }
}