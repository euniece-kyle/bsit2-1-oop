import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("------ Student " + (i + 1) + " ------");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            System.out.print("Enter Grade 1: ");
            double grade1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Grade 2: ");
            double grade2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Grade 3: ");
            double grade3 = Double.parseDouble(scanner.nextLine());

            students[i] = new Student(name, age, course, grade1, grade2, grade3);
            System.out.println(); // Blank line before next student
        }

        int passCount = 0;
        System.out.println("----- Student Information -----\n");
        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            String letter = s.getLetterGrade();
            boolean passing = s.isPassing();

            if (passing) passCount++;

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + letter);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println("-----------------------------\n");
        }

        System.out.println("Summary: " + passCount + " out of " + students.length + " students are passing.");

        scanner.close();
    }
}
