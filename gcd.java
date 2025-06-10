import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create Scanner object for user input

        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = number.nextInt();

        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = number.nextInt();

        // Call gcd() method to find GCD of the two numbers
        int gcd = gcd(num1, num2);

        // Print the result
        System.out.println("The GCD of two numbers is: " + gcd);

        number.close(); // Close the Scanner object
    }

    // Method to calculate GCD of two numbers
    public static int gcd(int num1, int num2) {
        int gcd = 1; // Initialize gcd value
        int i = 2; // Start checking from 2 (smallest possible divisor besides 1)

        // Find the smaller of the two numbers (we don’t need to check beyond that)
        int small = small(num1, num2);

        // Loop through all numbers from 2 to the smaller number
        while (i <= small) {
            // If i divides both numbers, update gcd
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd; // Return the greatest common divisor
    }

    // Method to return the smaller of two numbers
    public static int small(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
