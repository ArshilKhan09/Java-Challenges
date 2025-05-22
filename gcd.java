import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = number.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = number.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("The GCD of two number is : " + gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int small = small(num1, num2);
        while (i <= small) {
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int small(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}