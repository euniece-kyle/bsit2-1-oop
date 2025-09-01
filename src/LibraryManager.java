import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books;
    Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }


    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized!");
            }
            System.out.println("--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }
    }

 
    public void addBook() {
        System.out.print("Enter book title to add: ");
        String title = scanner.nextLine();
        try {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.trim().length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }
            books.add(title.trim());
            System.out.println("Book '" + title.trim() + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

  
    public void removeBook() {
        if (books.isEmpty()) {
            System.out.println("No books to remove!");
            return;
        }
        System.out.print("Enter book number to remove (1-" + books.size() + "): ");
        try {
            String input = scanner.nextLine();
            int index = Integer.parseInt(input) - 1;
            if (index < 0) {
                throw new IllegalArgumentException("Book index cannot be negative!");
            }
            String removedBook = books.remove(index);
            System.out.println("Book '" + removedBook + "' removed successfully
