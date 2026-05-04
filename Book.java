public abstract class Book {
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;

    public Book() {
        
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn){ this.isbn = isbn; }
    public void setBookTitle(String t){ this.bookTitle = t; }
    public void setAuthorName(String a){ this.authorName = a; }
    public void setPrice(double p){ this.price = p; }
    public void setAvailableQuantity(int q){ this.availableQuantity = q; }

    public String getIsbn(){ return isbn; }
    public String getBookTitle(){ return bookTitle; }
    public String getAuthorName(){ return authorName; }
    public double getPrice(){ return price; }
    public int getAvailableQuantity(){ return availableQuantity; }

    abstract void showDetails();
}