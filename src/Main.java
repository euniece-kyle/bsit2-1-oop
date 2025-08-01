import java.util.Scanner;

public class SumoftheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TotalNumber = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter the number " + i + ":");
            int number = scanner.nextInt();
            TotalNumber += number;
        }
        System.out.println("Total Number: " + TotalNumber);

        scanner.close();
    }

}
