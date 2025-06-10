import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = inp.nextInt(); // Read the number

        // Call the method to reverse the number
        int reverse = reverse(num);

        // Display the reversed number
        System.out.println("The reverse of the number is: " + reverse);

        inp.close(); // Close the Scanner
    }

    // Method to reverse the digits of the given number
    public static int reverse(int num) {
        int sum = 0;

        // Loop until all digits are processed
        while (num > 0) {
            int digit = num % 10;         // Get the last digit
            sum = sum * 10 + digit;       // Append digit to reversed number
            num /= 10;                    // Remove last digit from original number
        }

        return sum; // Return the reversed number
    }
}
