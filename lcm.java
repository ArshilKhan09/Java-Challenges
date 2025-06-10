import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = number.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = number.nextInt();

        // Call the least() method to calculate LCM of num1 and num2
        int lcm = least(num1, num2);

        // Display the LCM result
        System.out.println("The Least Common Multiple of both the numbers is: " + lcm);

        number.close(); // Close the Scanner object
    }

    // Method to calculate LCM (Least Common Multiple)
    public static int least(int num1, int num2) {
        int i = 1;

        // Multiply num1 with increasing values of i (1, 2, 3, ...) until we find a multiple of num2
        while (i <= num2) {
            int factor = num1 * i; // Current multiple of num1

            // Check if it is also divisible by num2
            if (factor % num2 == 0) {
                return factor; // This is the LCM
            }

            i++; // Increment i and try next multiple
        }

        // If no common multiple is found (this case never happens with positive integers), return 0
        return 0;
    }
}
