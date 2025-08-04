public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;  
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

   
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned '" + title + "'. Thank you!");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }

 
    public static void main(String[] args) {
        Book book1 = new Book("Love Hypothesis", "Ali Hazelwood", 376);
        Book book2 = new Book("Hunger Games", "Suzanne Collins", 374);
        Book book3 = new Book("Harry Potter", "J.K Rowling", 309);

        System.out.println();
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        System.out.println();

        book1.borrowBook();
        book1.borrowBook(); 
        book1.returnBook();
        book1.returnBook(); 
    }
}
