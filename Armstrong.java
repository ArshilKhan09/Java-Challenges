import java.util.Scanner; // Import Scanner class for taking user input

public class Armstrong {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Enter the number : ");
        int num = number.nextInt(); // Read the number from user

        // Check if the number is an Armstrong number
        boolean isarmstrong = isarmstrong(num);

        // Display the result based on the check
        if (isarmstrong){
            System.out.println("Your Number is Armstrong");
        } else {
            System.out.println("Your Number is not Armstrong");
        }

        number.close(); // Close the Scanner
    }

    // Method to check whether a number is Armstrong or not
    public static boolean isarmstrong(int num){
        int digit = digit(num); // Get the number of digits
        int numcopy = num; // Make a copy of the original number
        int finalNumber = 0; // This will store the sum of digits raised to power

        // Loop to calculate the sum of each digit raised to the power of total digits
        while (num > 0){
            int digits = num % 10; // Extract last digit
            num /= 10; // Remove the last digit
            finalNumber += power(digits, digit); // Add digit^number_of_digits to sum
        }

        return finalNumber == numcopy; // Return true if it matches the original number
    }

    // Method to calculate power (num1 raised to num2)
    public static int power(int num1 , int num2){
        int result = 1;
        int i = 0;

        // Multiply num1 with itself num2 times
        while (i < num2){
            result *= num1;
            i++;
        }

        return result;
    }

    // Method to count number of digits in the number
    public static int digit(int num){
        int digit = 0;

        // Count digits by dividing number by 10 repeatedly
        while (num > 0){
            digit++;
            num /= 10;
        }

        return digit;
    }
}



/* Output of the give code is :-
   If you input 153, the code will Count 3 digits.

  Calculate 
 1^3 + 5^3 + 3^3  = 1 + 125 + 27 = 153

Since the result equals the original number, it prints that it's an Armstrong number.
 * 
 */