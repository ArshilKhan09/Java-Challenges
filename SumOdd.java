import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = number.nextInt();
        int sum =sumOfOdd(num);
        System.out.println("The sum of all odd number till "+num+" is : "+sum);

        number.close();
    }

    public static int sumOfOdd(int num){
        int sum = 0 ;
        int i = 1 ;
        while (i <= num) {
            sum += i ;
            i += 2 ;
        }
        return sum;
    }
}
