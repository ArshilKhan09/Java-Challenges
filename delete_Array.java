import java.util.Scanner; 

public class delete_Array {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.print("Enter the Number of Element in Array: ");
        int size = number.nextInt();

        // Create an array of the specified size
        int[] numArray = new int[size];

        // Get elements of the array from the user
        int i = 0;
        while (i < size) {
            System.out.print("Please enter the element no " + (i + 1) + ": ");
            numArray[i] = number.nextInt();
            i++;
        }

        // Ask user which number they want to delete from the array
        System.out.print("Enter the number that you want to delete: ");
        int numTodelete = number.nextInt();

        // Call method to delete the specified number from the array
        int[] newArr = deleteNumber(numArray, numTodelete);

        // Display the new array after deletion
        System.out.println("Array After Deleting " + numTodelete + " the New Array is:");
        int Display = displayArray(newArr);

        number.close(); // Close the scanner object
    }

    // Method to display elements of the array
    public static int displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println(); // Move to the next line after printing array
        return i;
    }

    // Method to delete all occurrences of a given number from the array
    public static int[] deleteNumber(int[] numArray, int numTodelete) {
        // Count how many times the number appears in the array
        int occ = Occurence.occurance(numArray, numTodelete); // Note: class Occurence must be defined separately

        // If number is not found, return the original array
        if (occ == 0) {
            return numArray;
        }

        // Create a new array with reduced size after removing the number
        int newSize = numArray.length - occ;
        int[] newArr = new int[newSize];

        // Copy elements except the one to be deleted
        int i = 0, j = 0;
        while (i < numArray.length) {
            if (numArray[i] != numTodelete) {
                newArr[j] = numArray[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
