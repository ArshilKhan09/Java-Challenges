import java.util.Scanner;

public class Palindrome {  // A palindrome number is the same when read forward and backward
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = input.nextInt(); // Read the input number

        // Check if the number is a palindrome using the palindrome() method
        boolean ispalindrome = palindrome(num);

        // Display result based on whether the number is a palindrome
        if (ispalindrome) {
            System.out.println("The number " + num + " is a palindrome");
        } else {
            System.out.println("The number " + num + " is not a palindrome");
        }

        input.close(); // Close the Scanner object
    }

    // Method to check if a number is a palindrome
    public static boolean palindrome(int num) {
        // A number is a palindrome if it is equal to its reverse
        return num == reverse(num);
    }

    // Method to reverse the digits of a number
    public static int reverse(int num) {
        int sum = 0;

        // Extract digits one by one and build the reversed number
        while (num > 0) {
            int digit = num % 10;        // Get the last digit
            sum = sum * 10 + digit;      // Add digit to the reversed number
            num /= 10;                   // Remove the last digit
        }

        return sum; // Return the reversed number
    }
}
