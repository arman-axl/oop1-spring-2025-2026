public class Start {
    public static void main(String[] args) {
        BookShop shop = new BookShop("AIUB Book Shop");

        StoryBook sb1 = new StoryBook("S1","aaaa","bbbb",25,10,"cccc");
        StoryBook sb2 = new StoryBook("S2","dddd","eeee",18,15,"ffff");

        TextBook tb1 = new TextBook("T1","aaaa","bbbb",45,20,1);
        TextBook tb2 = new TextBook("T2","cccc","dddd",50,15,2);

        shop.insertBook(sb1); shop.insertBook(sb2); 
        shop.insertBook(tb1); shop.insertBook(tb2);

        shop.showAllBooks();
    }
}