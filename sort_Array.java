public class sort_Array {
    public static void main(String[] args) {
        // Take array input using a utility method (assumed to be defined elsewhere)
        int[] sortArray = ArrayUtility.inputArray();

        // Check if the array is sorted in increasing order
        boolean isIncreasing = isIncreasing(sortArray);

        // Check if the array is sorted in decreasing order
        boolean isDecreasing = isDecreasing(sortArray);

        // If the array is sorted in either order, print that it is sorted
        if (isIncreasing || isDecreasing) {
            System.out.println("Your Array is Sorted");
        } else {
            System.out.println("Your Array is Not Sorted");
        }
    }

    // Method to check if the array is sorted in increasing order
    public static boolean isIncreasing(int[] sortArray) {
        int i = 1;

        // Loop through the array from the second element
        while (i < sortArray.length) {
            // If the current element is smaller than the previous one, it's not increasing
            if (sortArray[i] < sortArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true; // All elements are in increasing order
    }

    // Method to check if the array is sorted in decreasing order
    public static boolean isDecreasing(int[] sortArray) {
        int i = 1;

        // Loop through the array from the second element
        while (i < sortArray.length) {
            // If the current element is greater than the previous one, it's not decreasing
            if (sortArray[i] > sortArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true; // All elements are in decreasing order
    }
}
