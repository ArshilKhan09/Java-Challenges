import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = number.nextInt();
        long factorial = fact(num);
        System.out.println("The factorial of "+num+" is : "+factorial);
    }
    public static long fact(int num){
        if (num < 2) {
           return 1;
        }
        long fact = 1 ;
        int i = 2 ;
        while(i <= num){
            fact *= i ;
            i++;
        }
        return fact;
    }

}
