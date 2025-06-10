import java.util.Scanner; 

public class factorial {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = number.nextInt(); // Read the input number

        // Call the fact() method to calculate the factorial
        long factorial = fact(num);

        // Display the result
        System.out.println("The factorial of " + num + " is: " + factorial);

        number.close(); // Close the scanner
    }

    // Method to calculate factorial of a number
    public static long fact(int num) {
        // Factorial of 0 or 1 is 1
        if (num < 2) {
            return 1;
        }

        long fact = 1; // Initialize factorial result to 1
        int i = 2;     // Start multiplying from 2

        // Multiply numbers from 2 to num to calculate factorial
        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact; // Return the calculated factorial
    }
}
