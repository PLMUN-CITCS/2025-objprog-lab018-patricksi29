import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Get the user's integer input
        int number = getIntegerInput();
        
        // Determine if the number is even or odd and display the result
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter an integer: ");
        
        // Validate the user input and ensure it's a valid integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            System.out.print("Enter an integer: ");
            scanner.next();  // Discard the invalid input
        }
        
        // Return the valid integer
        return scanner.nextInt();
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Check if the number is divisible by 2 (even) or not (odd)
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
