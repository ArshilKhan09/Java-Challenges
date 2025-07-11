import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side A :");
        double sideA = input.nextDouble();
        System.out.print("Enter the side B :");
        double sideB = input.nextDouble();

        double hypotenuse_c = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
        System.out.printf("The Hypotenuse Side C is : %.2fcm\n",hypotenuse_c);

        input.close();
    }
}
