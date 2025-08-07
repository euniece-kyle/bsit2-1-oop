public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;


    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.printf("Grades: %.1f, %.1f, %.1f\n", grade1, grade2, grade3);
    }


    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }


    public String getLetterGrade() {
        double aver = calculateAverage();
        if (aver >= 90) return "A";
        else if (aver >= 80) return "B";
        else if (aver >= 70) return "C";
        else if (aver >= 60) return "D";
        else return "F";
    }


    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
