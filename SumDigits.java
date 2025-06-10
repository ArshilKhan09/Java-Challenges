import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner number = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number : ");
        int num = number.nextInt();

        // Call the method to calculate the sum of digits
        int digits = sumOfDigit(num);

        // Print the result
        System.out.println("The sum of " + num + " is : " + digits);

        // Close the Scanner
        number.close();
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigit(int num) {
        int sum = 0;

        // Loop through each digit of the number
        while (num > 0) {
            sum += num % 10;   // Add the last digit to sum
            num /= 10;         // Remove the last digit from the number
        }

        // Return the total sum of digits
        return sum;
    }
}
