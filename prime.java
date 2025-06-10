import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = inp.nextInt(); // Read the number from the user

        // Call the method to check if the number is prime
        boolean isPrime = isprime(num);

        // Display the result
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not Prime");
        }

        inp.close(); // Close the Scanner
    }

    // Method to check if a number is prime
    public static boolean isprime(int num) {
        int i = 2;

        // A prime number is only divisible by 1 and itself
        // Start checking from 2 up to num-1
        while (i < num) {
            // If num is divisible by any i, it is not prime
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        return true; // If no divisor found, number is prime
    }
}
