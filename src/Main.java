public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        libraryManager.showBooks();
      
        libraryManager.addBook();

        libraryManager.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
