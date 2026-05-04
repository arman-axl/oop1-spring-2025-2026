public class BookShop implements BookShopOperations, BookOperations {
    String name;
    Book[] listOfBooks = new Book[100];

    public BookShop() {

    }
    
    public BookShop(String name) {
        this.name = name;
    }

    public void setName(String name){ 
        this.name = name; 
    }
    public String getName(){ 
        return name; 
    }

    public boolean insertBook(Book b) {
        for(int i = 0; i < listOfBooks.length; i++) {
            if(listOfBooks[i] == null) {
                listOfBooks[i] = b;
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(Book b) {
        for(int i = 0; i < listOfBooks.length; i++) {
            if(listOfBooks[i] != null && listOfBooks[i].getIsbn().equals(b.getIsbn())) {
                listOfBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        System.out.println("All Books " + name);
        for(Book b : listOfBooks) {
            if(b != null) b.showDetails();
        }
    }

    public Book searchBook(String isbn) {
        for(Book b : listOfBooks) {
            if(b != null && b.getIsbn().equals(isbn))
                return b;
        }
        return null;
    }

    public void addQuantity(int amount) {
        System.out.println("Added " + amount + " quantity");
    }

    public void sellQuantity(int amount) {
        System.out.println("Sold " + amount + " quantity");
    }
}