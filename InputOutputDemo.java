import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for an integer input
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        
        // Prompt the user for a decimal number input
        System.out.print("Enter a decimal number: ");
        double userDouble = scanner.nextDouble();
        
        // Consume the newline character left by nextDouble() after reading the number
        scanner.nextLine();  // Prevents skipping the next string input
        
        // Prompt the user for a string input
        System.out.print("Enter a word or sentence: ");
        String userString = scanner.nextLine();
        
        // Output the results with formatting
        System.out.println("Your integer: " + userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);  // Format the decimal to 2 places
        System.out.println("Your string: " + userString);
        
        // Close the scanner to release resources
        scanner.close();
    }
}
