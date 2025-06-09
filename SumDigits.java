import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = number.nextInt();
        int digits = sumOfDigit(num);
        System.out.println("The sum of "+num+" is : "+digits);

        number.close();
    }
    public static int sumOfDigit(int num){
        int sum = 0 ;
        while (num > 0){
            sum += num % 10 ;
            num /= 10 ;
        }
        return sum ;
    }
}
