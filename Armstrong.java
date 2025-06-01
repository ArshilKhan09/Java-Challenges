import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = number.nextInt();
        boolean isarmstrong = isarmstrong(num);
        if (isarmstrong){
            System.out.println("Your Number is Armstrong");
        }
        else {
            System.out.println("Your Number is not Armstrong");
        }
    }
    public static boolean isarmstrong(int num){
        int digit = digit(num);
        int numcopy = num ;
        int finalNumber = 0 ;
        while (num > 0){
            int digits = num % 10;
            num /= 10 ;
            finalNumber += power(digits,digit);
        }
        return finalNumber == numcopy;
    }

    public static  int power(int num1 , int num2){
        int result = 1 ;
        int i = 0 ;
        while (i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int digit(int num){
        int digit = 0 ;
        while (num > 0){
            digit++;
            num /= 10 ;
        }
        return digit;
    }
}