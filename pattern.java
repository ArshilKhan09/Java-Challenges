import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        // Ask the user for the number of rows for the patterns
        System.out.print("Please Enter the Number of Rows: ");
        int row = input.nextInt(); // Read number of rows from the user

        // Call methods to print different types of patterns
        firstPattern(row);  // Right Half Pyramid
        secondPattern(row); // Reverse Half Pyramid
        thirdPattern(row);  // Left Half Pyramid

        input.close(); // Close the Scanner
    }

    // Method to print a Right Half Pyramid pattern
    public static void firstPattern(int maxRow) {
        System.out.println("\nFirst Pattern :- Right Half Pyramid");
        int row = 0;

        // Outer loop to handle number of rows
        while (row < maxRow) {
            System.out.print("*"); // Print the first star in each row

            // Inner loop to print remaining stars with space
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }

            System.out.println(); // Move to next line
            row++;
        }
    }

    // Method to print a Reverse Half Pyramid pattern
    public static void secondPattern(int maxRow) {
        System.out.println("\nSecond Pattern :- Reverse Half Pyramid");
        int row = maxRow;

        // Loop from maxRow to 1
        while (row > 0) {
            int i = 0;

            // Print stars equal to the current row number
            while (i < row) {
                System.out.print("* ");
                i++;
            }

            System.out.println(); // Move to next line
            row--;
        }
    }

    // Method to print a Left Half Pyramid pattern (right aligned)
    public static void thirdPattern(int maxRow) {
        System.out.println("\nThird Pattern :- Left Half Pyramid");
        int row = maxRow;

        // Loop to print each row
        while (row > 0) {
            int j = 0;

            // Print leading spaces to align stars to the right
            while (j < row - 1) {
                System.out.print("  "); // Two spaces for alignment
                j++;
            }

            int i = 0;

            // Print stars after spaces
            while (i <= (maxRow - row)) {
                System.out.print("* ");
                i++;
            }

            System.out.println(); // Move to next line
            row--;
        }
    }
}
