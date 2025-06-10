import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner number = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number : ");
        int num = number.nextInt();

        // Call the method to calculate the sum of all odd numbers up to 'num'
        int sum = sumOfOdd(num);

        // Display the result
        System.out.println("The sum of all odd numbers till " + num + " is : " + sum);

        // Close the Scanner object to free resources
        number.close();
    }

    // Method to calculate the sum of all odd numbers from 1 to 'num'
    public static int sumOfOdd(int num) {
        int sum = 0;
        int i = 1;

        // Loop through all odd numbers till 'num'
        while (i <= num) {
            sum += i;  // Add the current odd number to sum
            i += 2;    // Move to the next odd number
        }

        // Return the total sum
        return sum;
    }
}
