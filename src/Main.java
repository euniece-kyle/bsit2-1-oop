public class Main {
    public static void main(String[] args) {

        System.out.println("===LIBRARY MANAGEMENT SYSTEM TEST===");
        
        System.out.println("===Adding Items to Library===");
          System.out.println("Added: " + "Book - Java Programming by James Gosling");
          System.out.println("Added: " + "Magazine - Tech Today by Editor Smith");
          System.out.println("Added: " + "DVD - The Matrix by Wachowski Sisters ");

        LibraryManager manager = new LibraryManager();

        Book b1 = new Book("B001", "Java Programming", "James Gosling", "978-0135166307", 850, "Programming");
        Magazine m1 = new Magazine("M001", "Tech Today", "Editor Smith", 45, "September", true);
        DVD d1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");

        manager.addItem(b1);
        manager.addItem(m1);
        manager.addItem(d1);

      
        Student student = new Student("U001", "John Smith(Computer Science)", "john@example.com", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith(Engineering)", "drsmith@example.edu", "Engineering", "Professor");

        manager.displayAllItems();
        System.out.println();

        System.out.println("===TESTING BORROWING===");

        manager.borrowItem("B001", student.getName());
        student.addBorrowedItem(b1);

        manager.borrowItem("D001", faculty.getName());
        faculty.addBorrowedItem(d1);

        System.out.println("Student " + student.getName() + " borrowed: " + b1.title);
        System.out.println("Faculty " + faculty.getName() + " borrowed: " + d1.title);
        System.out.println();


        manager.displayAvailableItems();
        System.out.println();

        
        System.out.println("===TESTING LATE FEES===");
        System.out.println(b1.title + " - 5 days late: $" + b1.calculateLateFee(5));
        System.out.println(d1.title + " - 3 days late: $" + d1.calculateLateFee(3));
        System.out.println();

        System.out.println("===TESTING USER INFORMATION===");
        System.out.println("Student: ");
        student.displayBorrowedItems();

        System.out.println("Faculty: ");

        faculty.displayBorrowedItems();
        System.out.println();

       
        manager.returnItem("B001");
        student.removeBorrowedItem(b1);
        System.out.println("Returned: " + b1.title);
    }
}
