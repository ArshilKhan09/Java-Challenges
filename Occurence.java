import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Ask the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read array size

        int[] newArray = new int[n]; // Create array of size n

        // Prompt user to enter n integers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            newArray[i] = scanner.nextInt(); // Store user input in array
        }

        // Ask the user to enter the number to check its occurrence in the array
        System.out.print("Enter the number to find the occurrence: ");
        int num = scanner.nextInt(); // Read the number to search for

        // Call occurance() method to count how many times the number appears
        int occurance = occurance(newArray, num);

        // Display the result
        System.out.println("The occurrence of the given number is: " + occurance);

        scanner.close(); // Close the Scanner
    }

    // Method to count how many times 'num' appears in the array
    public static int occurance(int[] newArray, int num) {
        int occ = 0; // Initialize counter

        // Loop through each element in the array
        for (int value : newArray) {
            if (value == num) {
                occ++; // Increment counter if the value matches
            }
        }

        return occ; // Return the total count
    }
}
