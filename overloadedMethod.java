import java.util.Scanner;

public class overloadedMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the Third Number : ");
        int num3 = input.nextInt();

        addition(num1,num2);
        addition(num1,num2,num3);

        input.close();
    }
     static void addition ( int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of two Number is : "+sum );
    }
     static void addition ( int num1, int num2 , int num3){
        int sum = num1 + num2 + num3;
        System.out.println("The sum of Three Number is : "+sum);
    }
}
