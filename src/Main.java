public class Main {
    public static void main(String[] args) {
        System.out.println("===EMPLOYMENT MANAGEMENT SYSTEM===");
        System.out.println();

        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);
        
         //Adding comments coz I might forget stuff 
        //Connected to Manager code 
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());
        System.out.println();

        //Connected to Developer code 
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());
        System.out.println();

        //Connected to Intern code (let it go--)
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}
