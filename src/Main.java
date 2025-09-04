public class Main {
    public static void main(String[] args) {
        System.out.println("=== Book Record System ===\n");
        System.out.println("Adding books and ratings...");

        
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

    
        try {
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        
        System.out.print("Ratings added: ");
        int[] multipleRatings = {5, 4, 3, 5};
        for (int i = 0; i < multipleRatings.length; i++) {
            try {
                book1.addRating(multipleRatings[i]);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            System.out.print(multipleRatings[i]);
            if (i < multipleRatings.length - 1) System.out.print(", ");
        }
        System.out.println();

       
        try {
            book1.addRating(6);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        
        book2.addMultipleRatings(5, 4, 5, 4);
        book3.addMultipleRatings(3, 3, 3, 4);

        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());
        
        System.out.println("\nTotal books created: " + Book.getTotalBooks());

       
        Book highest = book1;
        if (book2.getAverageRating() > highest.getAverageRating()) {
            highest = book2;
        }
        if (book3.getAverageRating() > highest.getAverageRating()) {
            highest = book3;
        }
        
        System.out.println("Highest rated book: " + highest.getTitle() + " by " +
            highest.getAuthor() + " (" + String.format("%.2f", highest.getAverageRating()) + ")");
    }
}
