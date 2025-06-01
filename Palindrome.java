import java.util.Scanner;

public class Palindrome  {      // Same as from Front And Back
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        boolean ispalindrome = palindrome(num);
        if (ispalindrome) {
           System.out.println("The number " + num + " is palindrome");
        }
        else {
           System.out.println("The number " + num + " is not palindrome");
        }
    }
    public static boolean palindrome(int num){
        return num == reverse(num);
    }
    public static int reverse(int num){
        int sum = 0 ;
        while (num > 0){
            int digit = num % 10 ;
            sum = sum * 10 + digit;
            num /= 10 ;
        } return sum;
    }
}
