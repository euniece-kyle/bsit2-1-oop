class Student implements LibraryUser {
    private String name, studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() { return "Student"; }
    @Override
    public int getMaxBorrowLimit() { return 3; }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Teacher implements LibraryUser {
    private String name, employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() { return "Teacher"; }
    @Override
    public int getMaxBorrowLimit() { return 5; }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}

class Librarian implements LibraryUser {
    private String name, employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() { return "Librarian"; }
    @Override
    public int getMaxBorrowLimit() { return 10; }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}
