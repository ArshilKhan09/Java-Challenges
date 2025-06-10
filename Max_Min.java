public class Max_Min {
    public static void main(String[] args) {
        // Get an array of integers from the user (assumed to be implemented in ArrayUtility class)
        int[] newArray = ArrayUtility.inputArray();

        // Call methods to find the maximum and minimum values in the array
        int max = max(newArray);
        int min = min(newArray);

        // Display the results
        System.out.println("The Maximum number in the Array is " + max);
        System.out.println("The Minimum number in the Array is " + min);
    }

    // Method to find the maximum value in the array
    public static int max(int[] newArray) {
        // Return the smallest possible value if the array is empty
        if (newArray.length == 0) {
            return Integer.MIN_VALUE;
        }

        int i = 1; // Start from the second element
        int max = newArray[0]; // Assume the first element is the maximum

        // Loop through the array to find the maximum value
        while (i < newArray.length) {
            if (max < newArray[i]) {
                max = newArray[i]; // Update max if current element is greater
            }
            i++;
        }

        return max; // Return the maximum value
    }

    // Method to find the minimum value in the array
    public static int min(int[] newArray) {
        int i = 1; // Start from the second element
        int min = newArray[0]; // Assume the first element is the minimum

        // Loop through the array to find the minimum value
        while (i < newArray.length) {
            if (min > newArray[i]) {
                min = newArray[i]; // Update min if current element is smaller
            }
            i++;
        }

        return min; // Return the minimum value
    }
}
