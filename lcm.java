import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = number.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = number.nextInt();
        int lcm =least(num1,num2);
        System.out.println("The least Common Multiple of both the number is : "+ lcm);
    }

    public static int least(int num1 , int num2){
        int i = 1 ;
        while (i <= num2){
            int factor = num1*i ;
            if (factor % num2 == 0) {
                return factor ;
        }
            i++ ;
        }
        return 0;
    }
}