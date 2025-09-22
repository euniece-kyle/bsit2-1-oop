public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        Library library = new Library();

        System.out.println("Adding books to library...");
        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();
        library.displayAllBooks();
        System.out.println();

        System.out.println("Borrowing Java Programming...");
        library.borrowBook("1234567890");
        System.out.println();

        System.out.println("Trying to borrow Java Programming again...");
        library.borrowBook("1234567890");
        System.out.println();

        library.displayAvailableBooks();
        System.out.println();

        System.out.println("Returning Java Programming...");
        library.returnBook("1234567890");
        System.out.println();

        System.out.println("Testing validation...");
        Book invalidBook = new Book("Test", "Tester", "123", 1400);  // Invalid ISBN and year
    }
}
