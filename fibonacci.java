import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = number.nextInt(); // Read the number

        // Print the Fibonacci series up to the entered number
        System.out.println("The Fibonacci series of " + num + " is:");
        fibonacci(num); // Call the method to display Fibonacci series

        number.close(); // Close the Scanner
    }

    // Method to print Fibonacci series up to a given number
    public static void fibonacci(int num) {
        // If the number is negative, return without doing anything
        if (num < 0) return;

        // First Fibonacci number is always 0
        System.out.print("0 ");

        // If num is 0, there's no need to print further
        if (num == 0) return;

        // Second Fibonacci number is 1
        System.out.print("1 ");

        // Initialize first two Fibonacci numbers
        int first = 0, second = 1;

        // Loop to generate the next Fibonacci numbers until the value exceeds 'num'
        while (first + second <= num) {
            int third = first + second; // Calculate next number in the series
            System.out.print(third + " "); // Print the next number
            first = second;   // Move to the next two numbers
            second = third;
        }
    }
}
