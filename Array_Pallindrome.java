public class Array_Pallindrome {
    public static void main(String[] args) {

        // Taking array input using a utility method (assumed to be defined elsewhere)
        int[] array = ArrayUtility.inputArray();

         // Check if the number is a palindrome using the palindrome() method
        boolean ispalindrome = ispallindrome(array);
        if (ispalindrome) {
            System.out.println("The Array is palindrome");
        } else {
            System.out.println("The Array is not palindrome");
        }
    }
   
    // boolean method to find pallindrome
    public static boolean ispallindrome(int[] array){
     if (array.length <= 0) {
        System.out.println("Size of Array is Invalid");
        return false ;
     }

        int i = 0;  // Start index

        // Loop until the middle of the array is reached
        while (i < array.length / 2) {           
           if (array[i] != array[array.length -1 -i]) { // if the array[i] is not equal to array length -1 (if length = 5 (5-1= 4)) -i(updated number)
             return false ; // if this condition satisfy then the array is not pallindrome
           }

            i++;  // Move to the next element
        }

        return true; // if upper condition does not satisfy then the number is pallindrome
    }
}