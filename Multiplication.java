import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create Scanner object for user input

        // Ask the user to enter a number for which the multiplication table will be printed
        System.out.print("Enter the number for multiplication Table: ");
        int num = number.nextInt(); // Read the input number

        // Call the multi() method to print the multiplication table
        int result = multi(num);

        // Print the final value returned by multi() (which is not very useful in this case)
        System.out.println(result); // This will just print 11 (you can remove this if not needed)

        number.close(); // Close the Scanner
    }

    // Method to print the multiplication table of a given number
    public static int multi(int num) {
        int i = 1;

        // Loop from 1 to 10 to print the multiplication table
        while (i <= 10) {
            // Print one line of the table: num x i = result
            System.out.println(num + " x " + i + " = " + (num * i));
            i++; // Move to the next multiplier
        }

        return i; // This returns 11, but it's not really needed
    }
}
