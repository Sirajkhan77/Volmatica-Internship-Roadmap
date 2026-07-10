package Week1.Day4;
import java.util.Scanner;
public class CommandLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        System.out.println("Welcome to the Command-Line Calculator!");
        while (keepRunning) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Powering down... Have a great day!");
                keepRunning = false;
                continue;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please pick a number from the menu.");
                continue;
            }
            System.out.print("Enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter your second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Result: ");
            switch (choice) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! You cannot divide by zero.");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
            }
        }
        scanner.close();
    }
}