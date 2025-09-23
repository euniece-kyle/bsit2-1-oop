class Book extends Media {
    private String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public String getMediaType() { return "Book"; }

    @Override
    public void displayInfo() {
        System.out.println("Book: \"" + title + "\" by " + author + " (ID: " + itemId + ")");
    }
}

class DVD extends Media {
    private String director;

    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.director = director;
    }

    @Override
    public String getMediaType() { return "DVD"; }

    @Override
    public void displayInfo() {
        System.out.println("DVD: \"" + title + "\" directed by " + director + " (ID: " + itemId + ")");
    }
}

class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getMediaType() { return "Magazine"; }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: \"" + title + "\" Issue #" + issueNumber + " (ID: " + itemId + ")");
    }
}
