package newfirstprogram;
import java.util.Scanner;

public class SeniorCitizen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
    }
}









