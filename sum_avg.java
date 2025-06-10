public class sum_avg {
    public static void main(String[] args) {
        // Get array input from user using a utility method (defined elsewhere)
        int[] numArray = ArrayUtility.inputArray();

        // Calculate the sum of all elements in the array
        long sum = sum(numArray);

        // Calculate the average of the array elements
        int avg = avg(numArray);

        // Display the sum and average
        System.out.println("The Sum of the Array is : " + sum);
        System.out.println("The Average of the Array is : " + avg);
    }

    // Method to calculate the sum of elements in the array
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;

        // Loop through the array and add each element to the sum
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum; // Return the total sum
    }

    // Method to calculate the average of elements in the array
    public static int avg(int[] numArray) {
        // Use the sum() method to get total and then divide by number of elements
        long sum = sum(numArray);
        int avg = (int) sum / numArray.length; // Casting to int for integer average
        return avg;
    }
}
