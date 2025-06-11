import java.util.Scanner;

public class ArrayUtility {

    // Method to take array input from the user
    public static int[] inputArray() {

        // Create a Scanner object to read input from the user
        Scanner number = new Scanner(System.in);

        // Ask the user how many elements they want in the array
        System.out.print("Enter the number of Element : ");
        int size = number.nextInt(); // Read the size of the array

        // Create an array of the specified size
        int[] arr = new int[size];

        int i = 0; // Initialize index to start filling the array

        // Loop to take each element of the array from the user
        while (i < size) {
            System.out.print("Please enter the number " + (i + 1) + ": ");
            arr[i] = number.nextInt(); // Read and store each element
            i++; // Move to the next index
        }

        // Close the Scanner object to free system resources
        number.close();

        // Return the filled array
        return arr;
    }
}