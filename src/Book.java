public class Book {
    private String title;
    private String author;
    private String isbn;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        this.isAvailable = true;
    }

    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getYearPublished() { return yearPublished; }
    public boolean isAvailable() { return isAvailable; }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title. Title cannot be empty.");
            return;
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Invalid author. Author cannot be empty.");
            return;
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if (isbn.length() != 10 && isbn.length() != 13) {
            System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long");
            return;
        }
        this.isbn = isbn;
    }

    public void setYearPublished(int yearPublished) {
        if (yearPublished < 1450 || yearPublished > 2025) {
            System.out.println("Invalid year provided. Year must be between 1450 and 2025");
            return;
        }
        this.yearPublished = yearPublished;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author +
                " | ISBN: " + isbn + " | Year: " + yearPublished +
                " | Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
