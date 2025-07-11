import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter the Operator (+,-,*,/,^) : ");
        char symbol = input.next().charAt(0);

        System.out.print("Enter the Second Number : ");
        double num2 = input.nextDouble();

        double result = 0;
        switch (symbol){
            case '+' -> result =(num1+num2);
            case '-' -> result =(num1-num2);
            case '*' -> result =(num1*num2);
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by 0 ");
                }
                else {
                    result = (num1/num2);
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> System.out.println(symbol+" is not a valid operator");

        }
        System.out.println(result);
        input.close();
    }
}
