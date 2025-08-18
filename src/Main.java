public class GradeCalculator {

    public double calculateAverage(double... grades) {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String getLetterGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80 && average < 90) {
            return "B";
        } else if (average >= 70 && average < 80) {
            return "C";
        } else if (average >= 60 && average < 70) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayResult(String studentName, double average, String letterGrade) {
        if (letterGrade == null || letterGrade.isEmpty()) {
            System.out.printf("Student: %s, Average: %.1f%n", studentName, average);
        } else {
            System.out.printf("Student: %s, Average: %.1f, Grade: %s%n", studentName, average, letterGrade);
        }
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        String studentName = "John Smith";
        double average = calculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = calculator.getLetterGrade(average);

        calculator.displayResult(studentName, average, null);
        calculator.displayResult(studentName, average, letterGrade);
    }
}
