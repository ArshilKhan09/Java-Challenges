import java.util.Scanner;

public class Pallindrome {
    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not Pallindrome");
                return false;
            }

            left++;
            right--;
        }
        System.out.println("Pallindrome");
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter The String That you want to Check : ");
        String s = sc.next();

        checkIfPalindrome(s);

        sc.close();
    }

}
