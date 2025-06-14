import java.util.Random;
import java.util.Scanner;

public class question {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();

        int num1=number.nextInt(0,10);
        int num2=number.nextInt(0,10);

        System.out.println("What is "+num1+"+"+num2+" ?");

        System.out.print("Your Answer :");
        int inp = input.nextInt();
        if (inp == num1+num2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        input.close();
    }
}