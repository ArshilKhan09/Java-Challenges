// Class to reverse an array and display the result
public class Array_reverse {

    public static void main(String[] args) {

        // Taking array input using a utility method (assumed to be defined elsewhere)
        int[] numArr = ArrayUtility.inputArray();

        // Calling the reverse method to reverse the array
        reverse(numArr);

        // Printing the reversed array using another utility method
        System.out.println("The Reversed Array is ");
        delete_Array.displayArray(numArr);
    }

    // Method to reverse the given array in place
    public static void reverse(int[] arr){
        int i = 0;  // Start index

        // Loop until the middle of the array is reached
        while (i < arr.length / 2) {
            // Swap the element at position i with the element at the symmetric position from the end
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;

            i++;  // Move to the next element
        }
    }
}
