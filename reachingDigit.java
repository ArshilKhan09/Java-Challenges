import java.util.Scanner;

public class reachingDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a two digit number : ");
        int number = input.nextInt();
        int num1 =number/10 ;
        int num2 =number%10 ;

       System.out.println("The Digits are : "+num1+" and "+num2);
       input.close();
    }
}
