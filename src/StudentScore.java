import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student's Id: ");
        String studentId = scanner.nextLine();

        System.out.println("Enter the student's first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the student's last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter the student's course: ");
        String course = scanner.nextLine();

        System.out.println("Enter the student's section: ");
        String section = scanner.nextLine();

        System.out.println("\n Student Information: ");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + "" + lastName);
        System.out.println("Student's Course: " + course);
        System.out.println("Student's Section: " + section);

        System.out.println("\n Exam Scores: ");

        System.out.println("Midterm Exam Score: ");
        int midScore = scanner.nextInt();
        System.out.println("Final Exam Score: ");
        int finalScore = scanner.nextInt();
        System.out.println("Project Score: ");
        int projScore = scanner.nextInt();
        System.out.print("Attendance Score: ");
        int attenScore = scanner.nextInt();

        int totalScore = midScore + finalScore + projScore + attenScore;
        double averageScore = ((double)totalScore / 400) * 100;


        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projScore);
        System.out.println("Attendance Score: " + attenScore);

        System.out.printf("\nAverage Score: " + averageScore);

        if (averageScore >= 75){
            System.out.println("Remarks: PASSED");
        } else{
            System.out.println("Remarks: FAILED");
        }
        scanner.close();
    }
}